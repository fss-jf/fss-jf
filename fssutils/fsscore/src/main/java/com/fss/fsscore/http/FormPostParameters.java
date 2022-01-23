package com.fss.fsscore.http;

import java.util.ArrayList;

public class FormPostParameters extends HttpParameters<FormPostParameter> {
	public ArrayList<FormPostParameter> getFormPostParameters() {
		return this.getItems();
	}
	public void setFormPostParameters(ArrayList<FormPostParameter> formPostParameters) {
		this.setItems(formPostParameters);
	}
	public String getFormPostBodyString() {
		return this.getFormPostBodyString();
	}
}