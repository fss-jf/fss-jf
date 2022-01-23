package com.fss.fsscore.http;

import java.util.ArrayList;

public class QueryStringParameters  extends  HttpParameters<QueryStringParameter> {
	public ArrayList<QueryStringParameter> getQueryStringParameters() {
		return this.getItems();
	}
	public void setHeaders(ArrayList<QueryStringParameter> queryStringParameters) {
		this.setItems(queryStringParameters);
	}
	public String getQueryString() {
		return this.getAsQueryString();
	}
}