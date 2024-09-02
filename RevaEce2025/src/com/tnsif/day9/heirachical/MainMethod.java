package com.tnsif.day9.heirachical;

public class MainMethod {

	public static void main(String[] args) {
		person p;
		p = new student("ECE","R21EN176","varsha","Bangalore");
		if(p instanceof student)
			System.out.println(p);

	}

}
