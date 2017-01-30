package main.controllers

import javax.inject.Inject

import play.api.mvc.{Action, Call, Controller}

class MainController @Inject()(call: Call) extends Controller {
  def subIndex = Action { implicit request =>
    Ok(Seq(
      "Direct -> " + sub.controllers.routes.SubController.index.url,
      "Injected -> " + call.url
    ).mkString(", ")) }
}
