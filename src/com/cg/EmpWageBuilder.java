package com.cg;

import java.util.Random;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Employee Wage Builder");
		System.out.println("----------------------");
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int NUM_OF_WORKING_DAYS = 20;

		Random rand = new Random();
		int totalEmpWage = 0;
		for (int day = 0; day <= NUM_OF_WORKING_DAYS; ++day) {
			int empCheck = rand.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			}
			int dailyWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += dailyWage;
			System.out.println("Employee Wage: "+dailyWage);
		}
		System.out.println("Monthly Employee Wage: " + totalEmpWage);
	}
}
