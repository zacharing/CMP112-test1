public class Phone {
	public String make;
	public String model;
	public int quantity;
	
//Above are the data members

Phone() {
	make = "Unknown";
	model = "Android";
	quantity = 1;
	}

Phone(String thisMake, String thisModel, int thisQuantity) {
	this();
	make = thisMake;
	model = thisModel;
	quantity = thisQuantity;	
	}

public String toString() {
	String output = "";
	output = "Make: "  +  make  +  "Model: "  +  model  +  "Quantity: "  +  quantity;
	return output;
	}
}

