package controllers;

import play.*;
import play.cache.Cached;
import play.mvc.*;
import play.mvc.Http.RequestBody;
import play.mvc.Security.Authenticated;

import views.html.*;

public class Application extends Controller {
	@With(VerboseAction.class)
	public static Result study() {
	    Logger.info("Calling action for2 ");
	  return ok("It works!");
	}

}