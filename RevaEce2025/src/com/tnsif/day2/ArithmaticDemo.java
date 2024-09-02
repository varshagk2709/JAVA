package com.tnsif.day2;

public class ArithmaticDemo {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		int c= 30;
		int d= 40;
		a++;
		int e = a++ + b + c + d++;
		System.out.println("value of e" + e);
		int f = --a + ++b + c + d;
		System.out.println(" value of f" +f);
	}
}
