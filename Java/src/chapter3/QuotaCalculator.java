package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

	public static void main(String[] args) {
		
		 //Initialize values we know
		
		int expectedSales = 10;
		

        //Get unknown values
		System.out.println("Enter the number of sales you've had last week: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfSales = scanner.nextInt();
		scanner.close();
	

        //Make a decision on the path to take – Output 
		if(numberOfSales >= expectedSales) {
			System.out.println("Congratulation! You did a excellent job!");
			
		}else {
			int salesShort = expectedSales - numberOfSales;
			
			System.out.println("I am so sorry, but you were " + salesShort + " sales short");
		}
	}

}
