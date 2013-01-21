name := "import-mongodb"

version := "0.1"

scalaVersion := "2.9.2"

resolvers ++= Seq(
  "ReportGrid (public)" at "http://nexus.reportgrid.com/content/repositories/public-releases",
  "Sonatype" at "http://oss.sonatype.org/content/repositories/public",
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe-snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Scala Tools" at "http://scala-tools.org/repo-snapshots/"
)

scalacOptions ++= Seq("-unchecked", "-deprecation")

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies ++= Seq(
  "com.reportgrid" %% "blueeyes-core" % "1.0.0-M6",
  "com.reportgrid" %% "blueeyes-json" % "1.0.0-M6",
  "com.reportgrid" %% "blueeyes-mongo" % "1.0.0-M6",
  "org.mongodb" %% "casbah" % "2.3.0",
  "org.scalaz"  %% "scalaz-core"        % "7.0.0-M3" ,
  "org.specs2" %% "specs2" % "1.12.2" % "test"
)