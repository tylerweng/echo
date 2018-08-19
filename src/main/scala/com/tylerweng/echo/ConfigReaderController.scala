package com.tylerweng.echo

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import javax.inject.Singleton

@Singleton
class ConfigReaderController extends Controller with ServerConfiguration {
  get("/config") { _: Request =>
    config.toString
  }
}
