package com.cg;

import java.util.Random;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private int empRatePerHour;
	private int numOfWorkingDays;
	private int maxHours;
	private int totalEmpWage;
	private String company;

	public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHours) {
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHours = maxHours;
		this.company = company;
	}

	public int computeEmpWage() {
		Random rand = new Random();
		int totalEmpHrs = 0;
		int dayCount = 0, empHrs = 0;
		while (dayCount < numOfWorkingDays && empHrs < maxHours) {
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
		return totalEmpWage;
	}

	public void print() {
		System.out.println(String.format("Monthly Employee Wage for company %s is %d", company, totalEmpWage));
	}

	public static void main(String[] args) {
		System.out.println("Employee Wage Builder");
		System.out.println("----------------------");
		EmpWageBuilder capgemini = new EmpWageBuilder("Capgemini", 20, 20, 20);
		EmpWageBuilder bridgelabs = new EmpWageBuilder("Bridgelabs", 10, 10, 20);
		capgemini.computeEmpWage();
		capgemini.print();
		bridgelabs.computeEmpWage();
		bridgelabs.print();
	}
}
