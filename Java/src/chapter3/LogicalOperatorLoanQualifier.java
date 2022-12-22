package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

	public static void main(String[] args) {
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
		
		if(salary >= requiredSalary && yearsOfExperience >= requiredExperience) {
		
			
		}else {
			System.out.println("Sorry, but you need to earn at least " + requiredSalary + " to be able to apply for te loan");
			
		}
			

	}

}
