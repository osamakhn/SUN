package com.yoppworks.chat.infrastructure

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{FreeSpec, Matchers}

class StaticRoutesSpec extends FreeSpec with Matchers with ScalatestRouteTest with StaticRoutes {

  "/static" - {
    "get" - {
      "should return a 200" in {
        Get("/static/validfile.html") ~> staticRoutes ~> check {
          assert(status === StatusCodes.OK)
          assert(responseAs[String] === "valid")
        }
      }
      "should return a 404 for unknown files" in {
        Get("/static/invalidfile.html") ~>
          Route.seal(staticRoutes) ~> check { // the route.seal tells the test that there should be not route
          assert(status === StatusCodes.NotFound)
        }
      }
      "should return index.html when access the route path" in {
        Get() ~> staticRoutes ~> check {
        assert(status === StatusCodes.OK)
          assert(responseAs[String] contains "<HTML>")
      }
    }
    }
  }
}
