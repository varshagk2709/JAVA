package com.tnsif.day20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraydemo {

	public static void main(String[] args) {
		int arr[]= {10,7,8,36,87,56,86,45,45};
		for(int i:arr)
		System.out.println("array elements are" +i);
		//without using for loop
		System.out.println("array after sorting:" +Arrays.toString(arr));
		//sort
		Arrays.sort(arr);
		System.out.println("array after sorting:" +Arrays.toString(arr));
		//searching
		int key = 7;
		System.out.println("found at index="+Arrays.binarySearch(arr,1,8,45 ));
	}

}
//A jagged array is an array of arrays such that member arrays can be of different sizes