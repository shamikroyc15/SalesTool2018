package ca.demo.salestool;

/*
    Represent the sales data for a given period 
*/
public class SalesData {
	private int data[] = {-1, 0, 87, 98, 34, 42, 42, 84};

	public void display() {
		
		/* *********************************************************** */
		
		// 1) Display of the Data
		System.out.println("Data in the Array: ");
		for(int i: data)	
			System.out.println("Next Value of Array Data = : " + i);
		
		/* *********************************************************** */
		
		// 2) Summing the values of data Array
		System.out.println("Summing Values of Data Array: ");
		int sum = 0;
		for(int i: data) {
			System.out.println("Next Value: " + i);
			sum += i;
		}

		System.out.println("Sum is: " + sum);
		
		/* *********************************************************** */
		
		// 3) Adding code for multiply 
		System.out.println("Multiplying Values of Data Array: ");
		double multiply = 1;
		for(int i = 0; i < data.length; i++) {
			multiply = multiply * data[i];
		}
		
		System.out.println("Multiply Value = " + multiply);
		
		/* *********************************************************** */
		
		// 4) Add 5 to each element of data array - Branch: master
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i] + 5;
 		}
		
		
		// 5) Subtract 2 from each element of data array 
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i] - 2;
 		}	
		
		// 6) Multiply each element of data Array by 5 - Branch: doWork1
		System.out.println("Doing some crazy operations on Data Array: ");
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i] * 5;
		}		
		
		/* *********************************************************** */
		
		// CONVERT STRING TO ARRAY
		// Create a string
		String myStr = "Hello";

		// Convert the string to a char array
		char[] myArray = myStr.toCharArray();

		// Print the first element of the array
		System.out.println(myArray[0]);	
		
		/* *********************************************************** */
	}

}
