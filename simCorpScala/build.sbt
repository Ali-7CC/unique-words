val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "simcorpscala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies +=  "org.scalatest" %% "scalatest-funsuite" % "3.2.14"

  )
