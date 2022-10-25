package app.resume

import com.raquo.laminar.api.L._

final case class Resume() {
  def apply(): HtmlElement = {
    div(
      SelfInformation()()
    )
  }
}
