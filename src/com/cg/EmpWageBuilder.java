package com.cg;

import java.util.Random;

public class EmpWageBuilder {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static int EMP_RATE_PER_HOUR = 20;
	static int NUM_OF_WORKING_DAYS = 20;
	static int MAX_HRS = 10;

	public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS) {
		Random rand = new Random();
		int totalEmpHrs = 0;
		int dayCount = 0, empHrs = 0;
		while (dayCount < NUM_OF_WORKING_DAYS && empHrs < MAX_HRS) {
			dayCount++;
			int empCheck = rand.nextInt(3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + dayCount + " Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println(String.format("Monthly Employee Wage for company %s is %d", company, totalEmpWage));
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("Employee Wage Builder");
		System.out.println("----------------------");
		computeEmpWage("Capgemini", 20, 20, 20);
		computeEmpWage("Bridgelabs", 10, 10, 20);
	}
}
