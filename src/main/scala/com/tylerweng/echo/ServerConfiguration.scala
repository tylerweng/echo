package com.tylerweng.echo

import com.typesafe.config.{Config, ConfigFactory}

trait ServerConfiguration {

  lazy val config: Config = ConfigFactory.parseResources("application.conf")

  trait DbConfig {
    lazy val root: Config = config.getConfig("db")

    lazy val url: String = root.getString("url")
    lazy val driver: String = root.getString("driver")
    lazy val maxThreads: Int = root.getInt("maxThreads")
  }

}
