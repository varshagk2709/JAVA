package com.tnsif.day9.heirachical;

public class person {
	private String name;
	private String address;
	public person() {
		super();
	}
	public person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	

}
