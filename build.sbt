val settings = Seq(version := "1.0", scalaVersion := "2.11.8")

lazy val sub = Project("sub", file("/sub")).enablePlugins(PlayScala).settings(settings)

lazy val main = Project("main", file(".")).enablePlugins(PlayScala).settings(settings)
  .dependsOn(sub).aggregate(sub)
