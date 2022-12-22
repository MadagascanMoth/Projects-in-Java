package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {

	public static void main(String[] args) {
		
		boolean letterFound = false;
		
		System.out.println("Enter a word: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		scanner.close();
		for(int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			if(currentLetter =='a' || currentLetter == 'A') {
				letterFound = true;
				break;
				
			}
			
		}
		if(letterFound) {
			System.out.println("This word contains letter 'A'");
		}else {
			System.out.println("This word doesn't contain letter 'A'");
			
		}

	}

}
