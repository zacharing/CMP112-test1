public class Phone {
	public String make;
	public String model;
	public int quantity;
	
//Above are the data members
//How the first one when printed will appear
Phone() {
	make = "Unknown";
	model = "Android";
	quantity = 1;
	}
//Doing this in order to make them seen
Phone(String thisMake, String thisModel, int thisQuantity) {
	this();
	make = thisMake;
	model = thisModel;
	quantity = thisQuantity;	
	}
//How it will look when it is printed
public String toString() {
	String output = "";
	output = "Make: "  +  make  +  "Model: "  +  model  +  "Quantity: "  +  quantity;
	return output;
	}
}

