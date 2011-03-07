package com.myimdb.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.myimdb.shared.SearchResultList;
import com.myimdb.shared.TokenSearchAction;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyIMDB implements EntryPoint {
	
	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final RPCServiceAsync rpcService = GWT
			.create(RPCService.class);

	
	public void onModuleLoad() {
		
		rpcService.execute(new TokenSearchAction("test"), new AsyncCallback<SearchResultList>() {

			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
			}

			@Override
			public void onSuccess(SearchResultList result) {
				Window.alert(result.getTitles().get(0));
			}
		});
		
		RootPanel.get();
	}
}
