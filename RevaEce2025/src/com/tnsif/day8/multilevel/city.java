package com.tnsif.day8.multilevel;

public class city extends sate{
	private String city_name;
	private String food
	public city() {
		super();
	}
	public city(String city_name, String food) {
		super();
		this.city_name = city_name;
		this.food = food;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "city [city_name=" + city_name + ", food=" + food + ", getState_name()=" + getState_name()
				+ ", getLanguage()=" + getLanguage() + ", getName()=" + getName() + ", getState()=" + getState() + "]";
	}
	

}
