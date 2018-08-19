name := "echo"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % "18.8.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % Runtime
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"