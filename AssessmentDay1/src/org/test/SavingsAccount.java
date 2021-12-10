package org.test;

import java.util.Scanner;

public class SavingsAccount extends Account {

	double rateOfInterest;

	Scanner sc = new Scanner(System.in);

	public void calculateInterest() {

		rateOfInterest = amount * 0.07;
		System.out.println("Rate of Interest is :" + rateOfInterest);

		amount = amount + rateOfInterest;
		System.out.println("Add the interest to the Account:" + amount);
	}

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.initalBalance();
		s.calculateInterest();
		s.withDraw();
		s.deposit();
	}

}
