package com.tnsif.day9.heirachical;

public class employee extends person {
	private String dep;
	private String salary;
	
	public employee() {
		super();
	}
	public employee(String dep, String salary, String name, String address) {
		super(name,address);
		this.dep = dep;
		this.salary = salary;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [dep=" + dep + ", salary=" + salary + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	

}
