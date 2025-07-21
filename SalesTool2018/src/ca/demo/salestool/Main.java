package ca.demo.salestool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
		System.out.println("WOot! It pushed!\n");
	}
	
	
	private static void doStashDemo1() {
		
		int x, y, sum;
	    Scanner myObj = new Scanner(System.in); // Create a Scanner object
	    System.out.println("Type a number:");
	    x = myObj.nextInt(); // Read user input

	    System.out.println("Type another number:");
	    y = myObj.nextInt(); // Read user input

	    sum = x + y;  // Calculate the sum of x + y
	    System.out.println("Sum is: " + sum); // Print the sum
	    
	    // String Reversal 
	    String originalStr = "Hello";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		
	}
	
	private static void doMergeDemo() {
		
		String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
		Arrays.sort(cars);
	    for (String i : cars) {
	      System.out.println(i);
	    }
		
	}
	
	private static void doMergeDemo1() {
		
		// ArrayList Loop
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for (String i : cars) {
	      System.out.println(i);
	    }
		
	}
	

}
