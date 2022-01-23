package com.fss.fsscore.http;

public interface INameValuePair {

	String getName();
	String getValue();
	boolean isUrlEncodeValue();
	void setUrlEncodeValue(boolean urlEncodeValue);
	void setUrlEncodeName(boolean urlEncodeName);
	boolean isUrlEncodeName();
	String getNameEqualsValue();
}
