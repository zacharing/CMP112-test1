class Body {
	public long idNum;
	public String name;
	public Body orbits;
	
	// Static variables do NOT go with objects, but rather with classes
	public static long nextID = 0;
	// Here is a final or constant data member
	public final double PI = 3.1416;

// Above this line is the data
/* ------------------------------------------------------------------------ */
// Below this line is the behavior

	// A method that has the same name as the class is called 
	// a constructor

	// Constructors (two of them here; there could be more)
	// C1
	Body() {
	   idNum = nextID++;
	   }
	
	 // C2
	 Body(Body orbitsAround, String bodyName) {
	  this();
	  name = bodyName;
	  orbits = orbitsAround;
	  }

	// C3
	Body(String bodyName) {
	  this();
	  orbits = null;
	  name = bodyName;
	  }

	// Most classes will need a toString() so we can visualize the object
	public String toString() {
	   String desc = idNum + " (" + name + ")";
	   if (orbits != null) 
		desc += " orbits " + orbits.toString();
	   return desc;
	   }
	
	public String toString(String arg) {
	    System.out.println("This is dumb: " + arg); 
		return "Hello";
	     }

}
