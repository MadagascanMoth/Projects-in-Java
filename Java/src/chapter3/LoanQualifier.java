package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

	public static void main(String[] args) {
		
		//Initialize what we know
		
		int requiredSalary = 30000;
		int requiredExperience = 2;
		


	    //Get what we don't
		System.out.println("Enter your salary: ");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextInt();
		System.out.println("Enter your years of experience: ");
		double yearsOfExperience = scanner.nextInt();
		scanner.close();
		
		
	    //Make decision
		
		if(salary >= requiredSalary) {
			if(yearsOfExperience >= requiredExperience) {
				System.out.println("Congrats! You may apply for the loan");
				
			}else {
				System.out.println("Sorry, but you need " + requiredExperience + " years of experience");
			}
			
		}else {
			System.out.println("Sorry, but you need to earn at least " + requiredSalary + " to be able to apply for te loan");
			
		}
			

	}

}
