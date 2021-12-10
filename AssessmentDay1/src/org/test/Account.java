package org.test;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	double amount;

	public void initalBalance() {
		System.out.print("Enter the Inital Balance:");
		amount = sc.nextDouble();

	}

	public void withDraw() {
		System.out.print("Enter the WithDrawal Amount:");

		double withdrawAmount = sc.nextDouble();
		amount = amount - withdrawAmount;
		System.out.println("Account Balance is:" + amount);

	}

	public void deposit() {
		System.out.print("Enter the Deposit Amount:");

		double depositAmount = sc.nextDouble();
		amount = amount + depositAmount;
		System.out.print("Account Balance is:" + amount);
	}

	public void getBalance() {
		System.out.println("Update Balance:" + amount);

	}

}
