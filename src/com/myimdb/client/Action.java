package com.myimdb.client;

import java.io.Serializable;

public interface Action<T extends Response> extends Serializable {
	
	public T search();

}
