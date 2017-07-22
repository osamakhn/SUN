package com.yoppworks.chat.infrastructure

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer


object Main extends App with StaticRoutes{
  //  val api : Chat = ???

  implicit val system = ActorSystem("SafetyDance")
  implicit val materializer = ActorMaterializer()

  val route: Route = staticRoutes

  val bindingFuture = Http().bindAndHandle(route, "localhost", 8081)
}