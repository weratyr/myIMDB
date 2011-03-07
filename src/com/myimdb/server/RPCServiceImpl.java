package com.myimdb.server;

import java.util.HashMap;
import java.util.Map;

import com.myimdb.client.Action;
import com.myimdb.client.RPCService;
import com.myimdb.client.Response;
import com.myimdb.shared.SearchResultList;
import com.myimdb.shared.TokenSearchAction;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Guice;

/**
 * The server side implementation of the RPC service.
 */

@SuppressWarnings("serial")
public class RPCServiceImpl extends RemoteServiceServlet implements
		RPCService {

	private Map<Class<? extends Action<? extends Response>>, ActionHandler> mappings;
	
	public RPCServiceImpl() { 
		mappings = new HashMap<Class<? extends Action<? extends Response>>, ActionHandler>();
		mappings.put(TokenSearchAction.class, new TokenSearchHandler());
	}
	
 	
	
	public <T extends Response> T execute(Action<T> action) {
		
		return (T) mappings.get(action.getClass()).execute(action);
	}


}
