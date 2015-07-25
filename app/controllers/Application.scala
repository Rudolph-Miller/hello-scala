package controllers

import play.api._
import play.api.mvc._

import models._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index(Users.get()))
  }

}
