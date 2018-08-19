package com.tylerweng.echo

import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.http.HttpServer

object ServerMain extends Server

class Server extends HttpServer with ServerConfiguration {

  override val defaultHttpPort: String = ":8080"
  override val defaultHttpsPort: String = "" // disable the default HTTPS port

  override def configureHttp(router: HttpRouter): Unit = {
    router
      .add[ExampleController]
      .add[ConfigReaderController]
  }

}
