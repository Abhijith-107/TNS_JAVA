package in.ac.jssateb.statickeyword;

// nested class
// inside a static method we can access only static
class Outer{
	// create variable in outer
	static int i=5;
	static class Inner{
		//create method in inner class
		static void display() {
			System.out.println("display method in inner class");
			System.out.println("Display value of i: " + i );
		}
	}
}

public class Nestedclass {

	public static void main(String[] args) {
		
        // Create an instance of the outer class
		Outer o = new Outer();
		// print vaiable of outer class
		System.out.println(o.i);
		
		//o.display() ; //-> not posible since its inside an another class
		
		// Create an instance of the inner class using the outer class instance
		Outer.Inner i = new Outer.Inner();
		// convert inner to static to access them 
		i.display();

	}

}
