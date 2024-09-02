package com.tnsif.day7;

public class PersonDemo {

	public static void main(String[] args) {
				Person p = new Person(); //Default constructor invoked
				p.setName("Vignesh");
				p.setAddress("Bangalore");
				p.setMob(99954236);
				
				System.out.println(p);
				
				//Parameterised Constructor; it does'nt need setter method like default constructor
				
				Person p1 = new Person("Varsha","Bangalore",954632175);
				System.out.println(p1);
}
}