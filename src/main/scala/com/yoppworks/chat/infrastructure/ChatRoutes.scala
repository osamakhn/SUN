package com.yoppworks.chat.infrastructure

import akka.http.scaladsl.common.EntityStreamingSupport
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.scaladsl.{Flow, Source}
import com.yoppworks.chat.domain.ChatMessage
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  // mapping; simple; can be fancy
  implicit val chatMessageFormat = jsonFormat3(ChatMessage.apply)
  // the coplete won't work so we need json-streaming support
  implicit val jsonEntityStreamingSupport = EntityStreamingSupport.json()
}


trait ChatRoutes extends JsonSupport {
  //  val api : Chat
  // this is gonna stream message via kafka stream

  val chatRoutes: Route = pathPrefix("api") {
    path("chat") {
      get {
        val source: Source[Int, Any] = Source(Range(0, 200000))
        val flow: Flow[Int, ChatMessage, Any] = Flow[Int].map(num => {
          Thread.sleep(1000)
          ChatMessage("System", s"Message: $num", "Main")
        })
        complete(source.via(flow))
      }
    }
  }
}


