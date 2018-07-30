package com.pluralsight.letsgetlogical;

public class Main {

    public static void main(String[] args) {
	    int students = 150;
	    int rooms = 0;

	    // By using conditional logical operators, we can save from computing the right side of this && if the left
        // side is false. This allows us to place breaking code to the right to show that it's working.
	    if (rooms > 0 && students / rooms > 30) {
	        System.out.println("Crowded!!");
        }

        System.out.println();
        System.out.println("** END OF PROGRAM **");
    }
}
