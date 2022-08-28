package com.bl.employewagemanagement;

import java.util.Random;

public class EmployeeWageComputation {

		public static void main(String[] args) {
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			int num = 1;
			int wagePerHour = 20;
			int fullDayHour = 8;
			int dailyEmployeeWage;
			
			Random rn = new Random();
			
			int empType = rn.nextInt(2);
		
			System.out.println(empType);
					
			if (empType == num) {
				
				System.out.println("Employee is present");
					
				dailyEmployeeWage = wagePerHour * fullDayHour;
				
				System.out.println("Employee daily wage " + dailyEmployeeWage);
			}
			else {
					
				System.out.println("Employee is absent");
				}
		}	
		}


