package com.yoppworks.chat.infrastructure

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route


trait StaticRoutes {
  val staticRoutes: Route = ???
}
