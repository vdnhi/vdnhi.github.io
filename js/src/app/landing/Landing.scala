package app.landing

import com.raquo.laminar.api.L._

final case class Landing() {
  def apply(): HtmlElement = {
    div("Hello World")
  }
}
