val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("1.3.0")
addSbtPlugin("org.scala-js"        % "sbt-scalajs"     % scalaJSVersion)
addSbtPlugin("com.jsuereth"        % "sbt-pgp"         % "1.1.2-1")
addSbtPlugin("com.eed3si9n"        % "sbt-unidoc"      % "0.4.3")
addSbtPlugin("pl.project13.scala"  % "sbt-jmh"         % "0.4.0")
addSbtPlugin("com.typesafe"        % "sbt-mima-plugin" % "0.8.1")
addSbtPlugin("com.typesafe.sbt"    % "sbt-git"         % "1.0.0")
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"    % "3.9.5")
addSbtPlugin("de.heikoseeberger"   % "sbt-header"      % "5.6.0")
addSbtPlugin("org.scalameta"       % "sbt-scalafmt"    % "2.4.2")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest"     % "0.9.7")
addSbtPlugin("org.scalameta"       % "sbt-mdoc"        % "2.2.12")
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.4")
