package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.RequestBody;

import views.html.*;

public class Application extends Controller {

	@With(VerboseAction.class)
	public static Result index() {
	    Logger.info("Calling action for2 ");
	  return ok("It works!");
	}

}