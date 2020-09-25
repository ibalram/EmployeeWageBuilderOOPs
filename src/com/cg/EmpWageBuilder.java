package com.cg;

import java.util.Random;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Employee Wage Builder");
		System.out.println("----------------------");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs = 0;
		Random rand = new Random();
		int empCheck = rand.nextInt(2);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		int dailyWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage: " + dailyWage);
	}
}
