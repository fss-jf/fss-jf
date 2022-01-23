package com.fss.fsscore.http;

import java.util.ArrayList;

public class HttpHeaders extends HttpParameters<HttpHeader> {
	public ArrayList<HttpHeader> getHeaders() {
		return this.getItems();
	}
	public void setHeaders(ArrayList<HttpHeader> headers) {
		super.setItems(headers);
	}
	public String getRawHeaderText() {
		return super.getAsRawHeaderText();
	}
}