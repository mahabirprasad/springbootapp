package com.mahwir;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistLambda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(25);
		al.add(0);
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		System.out.println(al );
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println(al);
		
	}

}
