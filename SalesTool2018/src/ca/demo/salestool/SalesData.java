package ca.demo.salestool;

/*
    Represent the sales data for a given period 
*/
public class SalesData {
	private int data[] = {-1, 0, 4, 42, 84};

	public void display() {
		System.out.println("Data in the Array: ");
		for(int i: data)	
			System.out.println("Next Value of Array Data = : " + i);
		
		// 1) Summing the values of data Array
		System.out.println("Data: ");
		int sum = 0;
		for(int i: data) {
			System.out.println("Next Value: " + i);
			sum += i;
		}

		System.out.println("Sum is: " + sum);
		
		// 2) Adding code for multiply 
		double multiply = 1;
		for(int i = 0; i < data.length; i++) {
			multiply = multiply * data[i];
		}
		
		System.out.println("Multiply Value = " + multiply);
		
		// 3) Add 5 to each element of data array 
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i] + 5;
 		}
		
		
		// 4) Subtract 2 from each element of data array 
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i] - 2;
 		}
		
	}

}
