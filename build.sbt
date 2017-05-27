name := "powerMockTb"


version := "1.0"


libraryDependencies ++= Seq(
  "org.mockito" % "mockito-all" % "1.9.5" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.powermock" % "powermock-mockito-release-full" % "1.6.4" pomOnly()
)


resolvers in Global  ++=Seq(
  "Local Maven Repository" at Path.userHome.asFile.toURI.toURL + ".m2/repository",
  "nexus-TypeSafe-ivy" at "http://dl.bintray.com/typesafe/ivy-releases/",
  "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "jasper" at "http://jasperreports.sourceforge.net/maven2",
  "jasper third party" at "http://jaspersoft.artifactoryonline.com/jaspersoft/third-party-ce-artifacts",
  "sbt-plugin-releases" at "http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"

)



