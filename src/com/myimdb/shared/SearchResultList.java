package com.myimdb.shared;

import java.util.ArrayList;

import com.myimdb.client.Response;

@SuppressWarnings("serial")
public class SearchResultList implements Response {
	
	private ArrayList<String> titles;

	
	public SearchResultList() {
		titles = new ArrayList<String>();
	}
	
	public ArrayList<String> getTitles() {
		return titles;
	}

	public void addTitle(String title) {
		titles.add(title);
	}

}
