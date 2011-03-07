package com.myimdb.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RPCServiceAsync {
	<T extends Response> void execute(Action<T> action, AsyncCallback<T> callback);
}
