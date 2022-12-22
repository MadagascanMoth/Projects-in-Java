package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

public class SalaryCalculator {

	public static void main(String[] args) {
		
		 //Initialize known values
		
		int salary = 1000;
		int bonus = 250;
		int bonusSale = 10;

	    //Get values for the unknown
		System.out.println("Enter the number of sales that the employee did: ");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		

	    //Quick detour for the bonus earners
		
		if(sales > bonusSale) {
			salary = salary + bonus;
			
		}

	    //Output
		System.out.println("The salary that the employee will have will be $" + salary);
		
		

	}

}
