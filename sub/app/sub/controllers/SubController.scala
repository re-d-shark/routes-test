package sub.controllers

import play.api.mvc.{Action, Controller}

class SubController extends Controller {
  def index = Action { implicit request => Ok("it's sub.") }
}
