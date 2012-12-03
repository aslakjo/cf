organization := "no.rocketfarm"

name := "content-fetcher"

version := "0.1-SNAPSHOT"

libraryDependencies  ++=  Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "net.databinder.dispatch" %% "dispatch-core" % "0.9.4",
  "nu.validator.htmlparser" % "htmlparser" % "1.2.1"	
)