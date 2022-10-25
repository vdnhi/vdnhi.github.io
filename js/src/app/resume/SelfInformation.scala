package app.resume

import com.raquo.laminar.api.L._

final case class SelfInformation() {

  private val email = "vdn1999bxvp@gmail.com"
  private val linkedin = "https://www.linkedin.com/in/vuducnhi/"
  private val github = "https://github.com/vdnhi/"

  def apply(): HtmlElement =
    div(
      div("Vu Duc Nhi"),
      div(
        div(
          "Email: ",
          a(
            href := s"mailto:$email",
            email
          ),
          a(
            href := linkedin,
            ""
          )
        )
      )
    )
}
