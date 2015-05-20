name := "plugin-test"

helloMessage in ThisBuild := Some("hello from this build")

lazy val root = project in file(".")

lazy val core = project in file("core")