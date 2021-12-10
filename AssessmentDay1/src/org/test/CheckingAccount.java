package org.test;

import java.util.Scanner;

public class CheckingAccount extends Account {

	Scanner sc = new Scanner(System.in);

	public void deductFee() {

		System.out.print("Enter the WithDrawal Amount:");
		double i = sc.nextDouble();
		double withdrawal = i;

		if (i <= 50000) {
			System.out.println("Don't deduct fee");

			amount = amount - i;

		} else {
			i = i * 5 / 10000;
			System.out.println("Deduct fee is:" + i);

			amount = amount - i - withdrawal;

		}
	}

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount();
		c.initalBalance();
		c.deductFee();
		c.getBalance();

	}

}
