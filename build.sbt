name := "spark-measure"

version := "0.11-SNAPSHOT"

scalaVersion := "2.11.11"
    
resolvers += Resolver.mavenLocal
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

isSnapshot := true

spIgnoreProvided := true
sparkVersion := "2.1.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j" % "2.8"
