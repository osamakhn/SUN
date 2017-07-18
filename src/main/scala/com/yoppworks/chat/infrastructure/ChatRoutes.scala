package com.yoppworks.chat.infrastructure

import akka.http.scaladsl.common.{ EntityStreamingSupport, JsonEntityStreamingSupport }
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import com.yoppworks.chat.api.Chat
import com.yoppworks.chat.domain.ChatMessage
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
}


trait ChatRoutes extends JsonSupport {
  val api : Chat
  val chatRoutes: Route = ???
}


