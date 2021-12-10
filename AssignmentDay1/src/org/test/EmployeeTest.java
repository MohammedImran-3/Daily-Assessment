package org.test;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Value:");

		Employee e = new Employee();

		int monthlySalary = sc.nextInt();
		e.setFirstName("Imran");
		System.out.println("Employee Name-1 :" + e.getFirstName());
		e.setMonthlySalary(monthlySalary);
		System.out.println("Yearly Income of Employee-1:" + e.getMonthlySalary() * 12);

		// After Raise
		System.out.println("Yearly Income of Employee-1 after Raise:" + e.getMonthlySalary() * 1.1 *12);

		System.out.println("-----------------------------------------------------------");

		System.out.print("Enter the Value:");

		Employee e1 = new Employee();

		int monthlySalary1 = sc.nextInt();
		e.setFirstName("Mani");
		System.out.println("Employee Name-2 :" + e.getFirstName());
		e1.setMonthlySalary(monthlySalary1);
		System.out.println("Yearly Income of Employee-2:" + e1.getMonthlySalary() * 12);

		// After Raise
		System.out.println("Yearly Income of Employee-1 after Raise:" + e1.getMonthlySalary() * 1.10 * 12);

	}

}
