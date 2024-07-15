package in.ac.jssateb.statickeyword;

public class Student {

	int usn;
	String name;
	//String college;
	static String college = "JSSATEB";
	/*
	 static is used for memory management:
	-> share the same variable or method of a given class
	-> The static keyword is used for a constant variable or a method that is the same for every instance of a class
	-> The users can apply static keywords with VARIABLES, METHODS , BLOCKS , and NESTED CLASS
	-> Shared memory allocation
	-> Accessible without object instantiation
	-> Can be overloaded, but not overridden
	 */
	
	// non-static method 
	/*
	void change() {
		// can access [ static and non static ] variables
		usn = 1;			//non-static
		name = "abhijnan";  //non-static
		college = "jss";  //static var
	}
	*/
	
	// static method : can access only static variables
	static void change() {
		/*
		 usn = 1;			//non-static
		 name = "abhijnan";  //non-static
		*/
		college = "jss";  //static var
	}
	
	
	
	
	// right click go to source and generate toString menthod
	// The toString() method returns the String representation of the object.
	//@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", college=" + college +"]";
	}

}
