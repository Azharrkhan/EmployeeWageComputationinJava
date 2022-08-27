package com.bl.employewagemanagement;

import java.util.Random;

public class EmployeeWageComputation {

		public static void main(String[] args) {
			
			int num = 1; 
			
			Random rn = new Random();
			
			int empType = rn.nextInt(2);
		
			System.out.println(empType);
					
			if (empType == num) {
				
				System.out.println("Employee is present");
			}
			else {
					
				System.out.println("Employee is absent");
				}
		}	
	
		}


