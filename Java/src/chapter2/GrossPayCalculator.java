package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		
		
		//1. Get the number of hours worked
		
		System.out.println("Enter the number of hours that the user worked: ");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
        //2. Get the hourly pay rate
		
		System.out.println("Enter the rate per hour: ");
		double rate = scanner.nextDouble();
		scanner.close();

        //3. Multiply hours and pay rate
		
		double payGross = hours * rate;

        //4. Display result
		
		System.out.println("The employee's total for working hours is $"+ payGross);

	}

}
