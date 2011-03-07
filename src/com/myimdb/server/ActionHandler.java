package com.myimdb.server;

public interface ActionHandler<Action,Response> {
	public Response execute(Action action);
}
