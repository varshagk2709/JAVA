package com.tnsif.day6.firstpackage;

public class sample {
	//default, public, private and protected data members
	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;
	//default, public, private and protected metods
	void defaultdisplay()
	{
		System.out.println("default method");
		System.out.println(a);
	}
	public int publicdisplay()
	{
		System.out.println("public method");
		return b;
	}
	private int privatedisplay()
	{
		System.out.println("private method");	
		return c;
	}
	protected int protecteddisplay()
	{
		System.out.println("protected method");
		return d;
	}
}
