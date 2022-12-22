package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

	public static void main(String[] args) {
		
		int payRate = 15;
		int maxHours = 40;
		
		System.out.println("Enter the number of hours worked: ");
		Scanner scanner= new Scanner (System.in);
		double hoursWorked = scanner.nextDouble();
		
		while(hoursWorked > maxHours ||hoursWorked < 1 ) {
			System.out.println("Invalid entry.Try again. The number of hours shouldn't exceed 40h per week");
			hoursWorked = scanner.nextDouble();
		}
		scanner.close();
		double grossPay = payRate * hoursWorked;
		System.out.println("The total amount of money earned is $ " + grossPay);

	}

}
