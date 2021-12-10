package org.test;

import java.util.Scanner;

public class ElectricityDetails {

	Scanner sc = new Scanner(System.in);

	public void electricityBill() {

		System.out.print("Enter the User-1 Electricity Bill:");
		int rate = sc.nextInt();

		if (rate >= 1 && rate <= 100) {
			System.out.println("Bill for User-1 : " + (rate - 100) * 0);

		} else {
			System.out.println("Bill for User-1 : " + (rate - 100) * 6.6);
		}

		System.out.print("Enter the User-2 Electricity Bill:");
		int rate1 = sc.nextInt();

		if (rate1 >= 1 && rate1 <= 100) {
			System.out.println("Bill for User-2 : " + (rate1 - 100) * 0);

		} else if (rate1 >= 101 && rate1 <= 200) {
			System.out.println("Bill for User-2 : " + (rate1 - 100) * 1.5);

		} else {
			System.out.println("Bill for User-2 : " + (rate1 - 100) * 6.6);
		}

		System.out.print("Enter the User-3 Electricity Bill:");
		int rate2 = sc.nextInt();

		if (rate2 >= 1 && rate2 <= 100) {
			System.out.println("Bill for User-3 : " + (rate2 - 100) * 0);

		} else if (rate2 >= 101 && rate2 <= 200) {
			System.out.println("Bill for User-3 : " + (rate2 - 100) * 2);

		} else if (rate2 >= 201 && rate2 <= 500) {
			System.out.println("Bill for User-3 : " + (rate2 - 100) * 3);

		} else {
			System.out.println("Bill for User-2 : " + (rate1 - 100) * 6.6);
		}

		System.out.print("Enter the User-4 Electricity Bill:");
		int rate3 = sc.nextInt();

		if (rate3 >= 1 && rate3 <= 100) {
			System.out.println("Bill for User-4 : " + (rate3 - 100) * 0);

		} else if (rate3 >= 101 && rate3 <= 200) {
			System.out.println("Bill for User-4 : " + (rate3 - 100) * 3.5);

		} else if (rate3 >= 201 && rate3 <= 500) {
			System.out.println("Bill for User-4 : " + (rate3 - 100) * 4.6);

		} else {
			System.out.println("Bill for User-4 : " + (rate3 - 100) * 6.6);
		}
	}

	public static void main(String[] args) {
		ElectricityDetails e = new ElectricityDetails();
		e.electricityBill();
	}

}
