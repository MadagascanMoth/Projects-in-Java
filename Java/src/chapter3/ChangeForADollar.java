package chapter3;

import java.util.Scanner;

public class ChangeForADollar {

	public static void main(String[] args) {
		
		   double penny = .01;
	       double nickel = .05;
	       double dime = .10;
	       double quarter = .25;
	       
	       System.out.println("Enter how many pennies do you want: ");
	       Scanner scanner = new Scanner (System.in);
	       int pennyAsked = scanner.nextInt();
	       System.out.println("Enter how many nickels do you want: ");
	       int nickelAsked = scanner.nextInt();
	       System.out.println("Enter how many dimes do you want: ");
	       int dimeAsked = scanner.nextInt();
	       System.out.println("Enter how many quarters do you want: ");
	       int quarterAsked = scanner.nextInt();
	       scanner.close();
	       
	       double sum = penny * pennyAsked + nickel * nickelAsked + dime * dimeAsked + quarter * quarterAsked; 
	       if(sum == 1){
	    	   System.out.println("Congrats! You win!");
	       }else if(sum < 1) {
	    	   sum = 1 - sum;
	    	   System.out.println("I'm so sorry, but you missed for " + sum);
	       }else if(sum > 1) {
	    	   sum = sum - 1;
	    	   System.out.println("You missed! You were " + sum + " over");
	       }
	       
	       

	}

}
