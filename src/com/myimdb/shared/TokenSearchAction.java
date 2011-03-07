package com.myimdb.shared;

import com.myimdb.client.Action;
import com.myimdb.client.Response;

@SuppressWarnings("serial")
public class TokenSearchAction implements Action<SearchResultList> {
	
	private String token;

	
	public TokenSearchAction() {
	}
	
	
	public TokenSearchAction(String token) {
		this.token = token;
	}
	
	@Override
	public SearchResultList search() {
		
		return null;
	}
	
	public String getToken() {
		return token;
	}

}
