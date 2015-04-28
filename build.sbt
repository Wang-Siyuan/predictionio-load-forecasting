import AssemblyKeys._

assemblySettings

name := "predictionio-energy-forecasting"

organization := "io.prediction"

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "io.prediction"             %% "core"                 % pioVersion.value            % "provided",
  "org.apache.spark"          %% "spark-core"           % "1.3.0"                     % "provided",
  "org.apache.spark"          %% "spark-mllib"          % "1.3.0"                     % "provided"
)
