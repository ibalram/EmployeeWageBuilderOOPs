package com.cg;

import java.util.Random;

public class EmpWageBuilder {
	
	public static void main(String[] args) {
		System.out.println("Welcome!\nEmployee Wage Builder Program");
		int IS_FULL_TIME = 1;
		Random rand = new Random();
		int empCheck = rand.nextInt(2);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
