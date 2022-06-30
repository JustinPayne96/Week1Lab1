package week1Lab1;

public class lab1Attempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 10;
		
		//create a variable to hold the cost of groceries at checkout
		double groceryCost = 22.96;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'H';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = true;
		
		//create a variable to hold a customer's first name
		String customersFirstName = "Timothy";
		
		//create a variable to hold a street address
		String streetAddress = "424 W New Hampton Blvd";
		
		//print all variables
		System.out.println(availablePlaneSeats);
		System.out.println(groceryCost);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(customersFirstName);
		System.out.println(streetAddress);
		
		
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		groceryCost = groceryCost + 2.15;
		System.out.println(groceryCost);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'V';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		isHotOutside = false;
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and last name of your choice
		String customersLastName = "West";
		String fullName = customersFirstName + ' ' + middleInitial + ' ' + customersLastName;
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("This is " + fullName + ". He lives at " + streetAddress);
		
	}

}
