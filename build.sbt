name := "observableMVU"

version := "0.1"

scalaVersion := "2.12.4"

enablePlugins(ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true
scalacOptions += "-Ypartial-unification"


libraryDependencies += "io.monix" %%% "monix-reactive" % "2.3.3"
libraryDependencies += "io.monix" %%% "monix-cats" % "2.3.3"
libraryDependencies += "io.monix" %%% "monix-execution" % "2.3.3"
libraryDependencies += "org.typelevel" %%% "cats-core" % "1.0.1"

