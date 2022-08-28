package com.bl.employewagemanagement;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");

		int num = 1;
		Random random = new Random();

		int empType = random.nextInt(3);

		System.out.println(empType);

		if (empType < num) {

			System.out.println("Employee is absent");
		} else if (empType == num) {

			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is partime");

			int wagePerHour = 20;
			int fullDayHour = 4;

			System.out.println("dailyEmployeeWage" + " is " + wagePerHour * fullDayHour);
		}
	}
}
