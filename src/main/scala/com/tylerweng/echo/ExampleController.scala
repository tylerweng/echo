package com.tylerweng.echo

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import javax.inject.Singleton

@Singleton
class ExampleController extends Controller {
  get("/") { request: Request =>
    "<h1>Hello, world!</h1>"
  }
}
