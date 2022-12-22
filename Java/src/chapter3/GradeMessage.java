package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

	public static void main(String[] args) {
		
		System.out.println("Enter your letter grade: ");
		Scanner scanner = new Scanner(System.in);
		String letterGrade = scanner.next();
		scanner.close();
		
		String message;
		switch (letterGrade) {
		case "A":
			message = "Excellent job";
			break;
		case "B":
			message = "Good job";
			break;
		case "C":
			message = "Could be better";
			break;
		case "D":
			message = "You need to practice more!";
			break;
		case "F":
			message = "I'm sorry, but you will have to stay and learn!";
			break;
		default:
			message = "Invalid grade!";
			break;
			
		}
		System.out.println(message);
		

	}

}
