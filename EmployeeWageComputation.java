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
			int monthlyHours = 100;
			int monthlySalary = 0;

			while ((monthlyHours > 0) && noOfDays > 0) {

			Random rn = new Random();

			int empType = rn.nextInt(3);

			System.out.println(monthlySalary);

			switch (empType) {
			case fullTime:
				empHour = 8;
				monthlyHours = monthlyHours - empHour;
				noOfDays -= 1;
				wage = empWagePerHour * empHour;
				monthlySalary += wage;
				break;

			case partTime:
				empHour = 4;
				monthlyHours = monthlyHours - empHour;
				noOfDays -= 1;
				wage = empWagePerHour * empHour;
				monthlySalary += wage;
				break;

			default:
				wage = 0;
				break;
			}
			System.out.println(noOfDays + " " + monthlyHours + " " + monthlySalary);
			}
			System.out.println("Monthly salary of employee is : " + monthlySalary);
		}
	}
