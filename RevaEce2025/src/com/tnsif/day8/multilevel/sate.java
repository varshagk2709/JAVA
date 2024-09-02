package com.tnsif.day8.multilevel;

public class sate extends country{
	private String State_name;
	private String language;
	public sate() {
		super();
	}
	public sate(String state_name, String language) {
		super();
		State_name = state_name;
		this.language = language;
	}
	public String getState_name() {
		return State_name;
	}
	public void setState_name(String state_name) {
		State_name = state_name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "sate [State_name=" + State_name + ", language=" + language + ", getName()=" + getName()
				+ ", getState()=" + getState() + "]";
	}
}
