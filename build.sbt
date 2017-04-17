name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

kotlinLib("stdlib")
kotlinVersion := "1.1.1"

javacOptions in Compile ++= "-cp" :: "target/scala-2.11/classes" :: Nil
kotlincOptions in Compile ++= "-cp" :: "target/scala-2.11/classes" :: Nil
scalacOptions in Compile ++= "-cp" :: "target/scala-2.11/classes" :: Nil

libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs
