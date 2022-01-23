package com.fss.fsscore.http;

import java.util.ArrayList;

public class HttpParameters<T extends NameValuePair & INameValuePair> {

	private ArrayList<T> items;
	
	public HttpParameters() {
		this.items = new ArrayList<T>();
	}

	protected String getAsRawHeaderText() {
		StringBuilder headersAsRawText = new StringBuilder();
		for (T t : this.getItems()) {
			headersAsRawText.append(String.format("%1$s: %2$s\r\n", t.getName(), t.getValue()));
		}
		return headersAsRawText.toString();
	}
	protected String getAsQueryString() {
		StringBuilder queryText = new StringBuilder();
		int loopCount = 0;
		for (T t : this.getItems()) {
			if (loopCount > 0) {
				queryText.append("&");
			}
			queryText.append(String.format("%1$s=%2$s\r\n", t.getName(), t.getValue()));
		}
		return queryText.toString();
	}
	protected String getAsFormPostString() {
		StringBuilder queryText = new StringBuilder();
		int loopCount = 0;
		for (T t : this.getItems()) {
			if (loopCount > 0) {
				queryText.append("&");
			}
			queryText.append(String.format("%1$s=%2$s\r\n", t.getName(), t.getValue()));
		}
		return queryText.toString();
	}
	protected ArrayList<T> getItems() {
		return items;
	}

	protected void setItems(ArrayList<T> items) {
		this.items = items;
	}
}
