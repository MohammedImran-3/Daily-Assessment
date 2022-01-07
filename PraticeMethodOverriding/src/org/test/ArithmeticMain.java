package org.test;

import java.util.Scanner;

public class ArithmeticMain extends Arithmetic {

	int a, b;

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;

	}

	@Override
	public int product(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArithmeticMain ar = new ArithmeticMain();

		System.out.print("Enter the value:");
		int add = ar.add(sc.nextInt(), sc.nextInt());
		System.out.println(add);

		System.out.print("Enter the value:");
		int sub = ar.sub(sc.nextInt(), sc.nextInt());
		System.out.println(sub);

		System.out.print("Enter the value:");
		int product = ar.product(sc.nextInt(), sc.nextInt());
		System.out.println(product);

		System.out.print("Enter the value:");
		int div = ar.div(sc.nextInt(), sc.nextInt());
		System.out.println(div);
	}

}
