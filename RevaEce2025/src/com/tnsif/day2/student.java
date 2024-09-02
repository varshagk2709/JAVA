package com.tnsif.day2;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		 String Name;
		 String srn;
		 long Mob;
		 String Branch;
		 float Marks;
		 int Age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student details");
		Name= sc.next();
		srn= sc.next();
		Mob= sc.nextLong();
		Branch= sc.next();
		Marks= sc.nextFloat();
		Age= sc.nextInt();
		System.out.println("Student Details "+Name+" "+srn+" "+Mob+" "+Branch+" "+Marks+" "+Age+"");		
	}
}