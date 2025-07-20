package ca.demo.salestool;

/*
    Represent the sales data for a given period 
*/
public class SalesData {
	private int data[] = {0, 4, 42};

	public void display() {
		System.out.println("Data: ");
		int sum = 0;
		for(int i: data) {
			System.out.println("Next Value: " + i);
			sum += i;
		}

		System.out.println("Sum is: " + sum);
	}

}
