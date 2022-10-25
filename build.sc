import mill._
import mill.scalalib._
import mill.scalajslib._
import mill.scalajslib.api._

object Config {
  def scalaVersion = "2.13.10"
  def scalaJSVersion = "1.11.0"
  def laminarVersion = "0.14.5"

  def jsDependencies = Agg(
    ivy"com.raquo::laminar::$laminarVersion"
  )
}

trait Common extends ScalaModule {
  def scalaVersion = Config.scalaVersion
  override def ivyDeps = super.ivyDeps() ++ Config.jsDependencies
  override def sources = T.sources(
    millSourcePath / "src"
  )
}

object js extends Common with ScalaJSModule {
  def scalaJSVersion = Config.scalaJSVersion
  override def moduleKind = T { ModuleKind.CommonJSModule }
  override def ivyDeps = super.ivyDeps() ++ Config.jsDependencies
}
