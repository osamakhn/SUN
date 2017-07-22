package com.yoppworks.chat.infrastructure

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer


object Main extends App with StaticRoutes with ChatRoutes{
  //  val api : Chat = ???

  implicit val system = ActorSystem("SafetyDance")
  implicit val materializer = ActorMaterializer()

  val route: Route = staticRoutes ~ chatRoutes

  val bindingFuture = Http().bindAndHandle(route, "localhost", 8081)
}