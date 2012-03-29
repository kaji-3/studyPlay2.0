package controllers;

import play.Logger;
import play.mvc.Action.Simple;
import play.mvc.Http.Context;
import play.mvc.Result;

public class VerboseAction extends Simple {

	@Override
	public Result call(Context ctx) throws Throwable {
	    Logger.info("Calling action for " + ctx);
	    return delegate.call(ctx);
	}

}
