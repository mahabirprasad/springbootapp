package com.mahwir;

import java.util.TreeSet;

public class TreesetLambda {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		t.add(0);
		t.add(25);
		t.add(10);
		t.add(5);
		t.add(15);
		System.out.println(t);
	}

}
