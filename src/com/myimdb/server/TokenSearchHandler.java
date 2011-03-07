package com.myimdb.server;

import com.myimdb.shared.SearchResultList;
import com.myimdb.shared.TokenSearchAction;

public class TokenSearchHandler implements ActionHandler<TokenSearchAction, SearchResultList> {

	@Override
	public SearchResultList execute(TokenSearchAction action) {
		if(action instanceof TokenSearchAction) {
			SearchResultList searchResultList = new SearchResultList();
			searchResultList.addTitle("007");
			return searchResultList;
		}
		return null;
	}

}
