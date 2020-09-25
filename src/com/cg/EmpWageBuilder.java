package com.cg;

import java.util.Random;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Employee Wage Builder");
		System.out.println("----------------------");
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

		Random rand = new Random();
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
		System.out.println("Employee Wage: " + dailyWage);
	}
}
