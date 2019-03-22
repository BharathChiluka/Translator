package com.Translator.model;

import org.springframework.stereotype.Component;

@Component
public class Script {

	private String fromLang;
	public String getFromLang() {
		return fromLang;
	}
	public void setFromLang(String fromLang) {
		this.fromLang = fromLang;
	}
	public String getToLang() {
		return toLang;
	}
	public void setToLang(String toLang) {
		this.toLang = toLang;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	private String toLang;
	private String text;
	
	
	
}
