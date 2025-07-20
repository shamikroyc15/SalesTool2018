package ca.demo.salestool;

public class SalesData {
	private int data[] = {-1, 0, 4, 42, 84};

	public void display() {
		System.out.println("Data in the Array: ");
		for(int i: data)	
			System.out.println("Next Value of Array Data = : " + i);
		
		// Adding code for multiply 
		double multiply = 1;
		for(int i = 0; i < data.length; i++) {
			multiply = multiply * data[i];
		}
		
		System.out.println("Multiply Value = " + multiply);
	}

}
