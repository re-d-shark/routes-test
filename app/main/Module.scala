package main

import com.google.inject.AbstractModule
import play.api.mvc.Call

class Module extends AbstractModule {
  def configure() = bind(classOf[Call]).toInstance(sub.controllers.routes.SubController.index)
}
