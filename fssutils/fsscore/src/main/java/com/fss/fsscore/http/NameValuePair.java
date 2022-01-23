package com.fss.fsscore.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NameValuePair implements INameValuePair {

	private Logger LOGGER = LoggerFactory.getLogger(NameValuePair.class);
	
	private String rawName;
	private String rawValue;
	private boolean urlEncodeValue = false;
	private boolean urlEncodeName = false;
	
	public NameValuePair() {
		
	}
	public NameValuePair(String name, String value) {
		this.setName(name);
		this.setValue(value);
	}
	public NameValuePair(String name, String value, boolean urlEncodeValue) {
		this(name, value);
		this.setUrlEncodeValue(urlEncodeValue);
	}
	public NameValuePair(String name, String value, boolean urlEncodeValue, boolean urlEncodeName) {
		this(name, value);
		this.setUrlEncodeValue(urlEncodeValue);
		this.setUrlEncodeName(urlEncodeName);
	}
	public String getName() {
		if (this.isUrlEncodeName()) {
			try {
				return URLEncoder.encode(this.rawName, StandardCharsets.UTF_8.toString());
			} catch (UnsupportedEncodingException unsupportedEncodingException) {
				LOGGER.error("Error url encoding {}.", this.rawName, unsupportedEncodingException);
				return this.rawName;
			}
		} else {
			return this.rawName;
		}
	}
	public void setName(String name) {
		this.rawName = name;
	}
	public String getValue() {
		if (this.isUrlEncodeValue()) {
			try {
				return URLEncoder.encode(this.rawValue, StandardCharsets.UTF_8.toString());
			} catch (UnsupportedEncodingException unsupportedEncodingException) {
				LOGGER.error("Error url encoding {}.", this.rawValue, unsupportedEncodingException);
				return this.rawValue;
			}
		} else {
			return this.rawValue;
		}
	}
	public void setValue(String value) {
		this.rawValue = value;
	}
	public String getNameEqualsValue() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("{}={}", this.getName(), this.getValue());
		}
		return String.format("%1$s=%2$s", this.getName(), this.getValue());
	}
	public boolean isUrlEncodeValue() {
		return urlEncodeValue;
	}
	public void setUrlEncodeValue(boolean urlEncodeValue) {
		this.urlEncodeValue = urlEncodeValue;
	}
	public boolean isUrlEncodeName() {
		return urlEncodeName;
	}
	public void setUrlEncodeName(boolean urlEncodeName) {
		this.urlEncodeName = urlEncodeName;
	}
	
}
