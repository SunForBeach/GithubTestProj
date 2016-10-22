package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData salesData = new SalesData();
		displayGreeting();
		salesData.display();
		
	}

	private static void displayGreeting() {
		System.out.println("Hello sale s people.");
		System.out.println("This app shows sales data.");
		System.out.println("Repeat line: This app shows sales data.");
	}
}
