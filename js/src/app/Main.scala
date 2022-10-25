package app

import com.raquo.laminar.api.L._
import org.scalajs.dom.document

object Main {

  private val app = div(
    "Hello World"
  )

  def main(args: Array[String]): Unit = {
    render(document.body, app)
  }

}