package chapter2;

import java.util.Scanner;

public class MadLibsGame {

	public static void main(String[] args) {
	System.out.println("Enter your favorite season: ");
	Scanner scanner = new Scanner(System.in);
	String season = scanner.next();
	System.out.println("Enter your favorite number: ");
	int number = scanner.nextInt();
	System.out.println("Enter your favorite color: ");
	String color = scanner.next();
	scanner.close();
	System.out.println("On a " + color + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
	

	}

}
