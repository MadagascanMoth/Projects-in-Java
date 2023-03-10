package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
	
	static Scanner scanner = new Scanner(System.in);
	static int requiredSalary = 25000;
	static int requiredCreditScore = 700;

	public static void main(String[] args) {
		
		double salary = getSalary();
		double creditScore = getCreditScore();
		scanner.close();		
		boolean qualified = isQualified(creditScore, salary);	
		notifyUser(qualified);

	}
	
	public static double getSalary() {
		System.out.println("Enter your salary: ");
		double salary = scanner.nextDouble();
		return salary;
	}
	
	public static double getCreditScore() {
		System.out.println("Enter your credit score: ");
		int creditScore = scanner.nextInt();
		return creditScore;
	}
	
	public static boolean isQualified(double creditScore, double salary) {
		if(creditScore >= requiredCreditScore && salary >= requiredSalary) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void notifyUser(boolean isQualified) {
		if(isQualified) {
			System.out.println("Congrats! You've been approved.");
		}else {
			System.out.println("Sorry. You've been declined");
		}
	}
	
	

}
