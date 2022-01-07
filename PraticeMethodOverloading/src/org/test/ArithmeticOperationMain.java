package org.test;

import java.util.Scanner;

public class ArithmeticOperationMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArithmeticOperation a = new ArithmeticOperation();

		System.out.print("Enter a Value:");
		a.arithmetic(sc.nextInt(), sc.nextInt());

		System.out.print("Enter a Value:");
		a.arithmetic(sc.nextInt(), sc.nextFloat());

		System.out.print("Enter a Value:");
		a.arithmetic(sc.nextInt(), sc.nextDouble());

		System.out.print("Enter a Value:");
		a.arithmetic(sc.nextFloat(), sc.nextInt());

	}

}
