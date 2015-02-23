public class Car {

	// Here are the data members for this code; make/year
	public String make;
	public int year;

/* ----------------------------------------------------------------- */

//The code below is stating that the make of the car is "Unknown" and the year  it was made was 2015 

Car () {
	make = "Unknown";
	year = 2015;
	}

//The code below is contructing a method to check to see if there is a make     before it moves on with the rest of code

Car (String thisMake) {
	this();
	make = thisMake;
	}

//This code checks to see what the make and year is so it can be printed

Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}

//This code is here to show how it would be printed when the code is run

public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
