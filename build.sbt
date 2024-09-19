ThisBuild / scalaVersion := "2.13.14"
ThisBuild / organization := "com.example"

lazy val hello = project
  .in(file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.apache.datasketches" % "datasketches-memory" % "3.0.1"
  )
