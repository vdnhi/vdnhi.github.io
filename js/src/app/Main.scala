package app

import app.landing.Landing
import app.resume.Resume
import com.raquo.laminar.api.L._
import io.frontroute._
import org.scalajs.dom

object Main {

  private val app = {
    div(
      pathEnd {
        Landing()()
      },
      path("resume") {
        Resume()()
      },
      noneMatched {
        div("Not found")
      }
    )
  }

  def main(args: Array[String]): Unit = {
    render(
      dom.document.getElementById("app-container"),
      app
    )
  }

}