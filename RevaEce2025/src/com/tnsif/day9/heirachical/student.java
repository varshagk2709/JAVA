package com.tnsif.day9.heirachical;

public class student extends person {
	private String branch;
	private String srn;
	public student() {
		super();
	}
	public student(String branch, String srn,String name, String address) {
		super(name,address);
		this.branch = branch;
		this.srn = srn;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSrn() {
		return srn;
	}
	public void setSrn(String srn) {
		this.srn = srn;
	}
	@Override
	public String toString() {
		return "student [branch=" + branch + ", srn=" + srn + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	

}
