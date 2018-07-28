import java.awt.*;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {
		System.out.println("Enter a word:");
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		String userInput ="entertainment";
		String uppercase = userInput.toUpperCase();
		
		char firstLetter =userInput.charAt(0);
		System.out.println(uppercase);
		System.out.println("Contines:" + userInput.contains("Enter".toLowerCase()));
	}

}
