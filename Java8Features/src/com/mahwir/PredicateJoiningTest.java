package com.mahwir;

import java.util.function.Predicate;

public class PredicateJoiningTest {

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = I -> I > 10;
		Predicate<Integer> p2 = I -> I % 2 == 0;
		System.out.println("number is greater than 10");
		m1(p1, x);
		System.out.println("number is even");
		m1(p2, x);
		System.out.println("number is not greater than 10");
		m1(p1.negate(), x);
		System.out.println("number is greater than 10 and even");
		m1(p1.and(p2), x);
		System.out.println("number is greater than 10 or even");
		m1(p1.or(p2), x);

	}

	private static void m1(Predicate<Integer> p, int[] x) {
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}

		}
	}

}
