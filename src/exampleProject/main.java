package exampleProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("My git hub example");
		
		
		
		// take input from keyboard
		System.out.println("Whats your name?");
		Scanner keyboard = new Scanner(System.in);
		
		//1. create a variable to store user input
		String personName = keyboard.nextLine();
		
		//2. output a welcome message
		System.out.println("Hello " + personName);
		
		System.out.println("hi");
	}

}
