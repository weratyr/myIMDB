package com.myimdb.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("rpcService")
public interface RPCService extends RemoteService {
	<T extends Response> T execute(Action<T> action);
}
