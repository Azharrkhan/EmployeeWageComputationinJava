package com.bl.employewagemanagement;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int wage = 0;
		int empHour = 0;
		int empWagePerHour = 20;
		int noOfDays = 20;
		final byte fullTime = 1;
		final byte partTime = 2;

		Random rn = new Random();

		int empType = rn.nextInt(3);

		System.out.println(empType);

		switch (empType) {
		case fullTime:
			empHour = 8;
			wage = empWagePerHour * empHour * noOfDays;
			System.out.println("Monthly wage of present employee is " + wage);
			break;

		case partTime:
			empHour = 4;
			wage = empWagePerHour * empHour * noOfDays;
			System.out.println("Monthly wage of part time employee is " + wage);
			break;

		default:
			wage = 0;
			System.out.println("Monthly wage of absent employee is " + wage);
			break;
		}
	}
}
