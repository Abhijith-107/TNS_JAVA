package in.ac.jssateb.superkeyword;

class Animal{
	String color = "brown";
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal{
	String color = "white";
	
	void eat() {
		System.out.println("Eating Meat");
	}
	
	void call() {
		System.out.println(color); //1st priority is given to the local variable - white
		System.out.println(super.color);// parent color - brown
	// super key cannot be used in static method 
		super.eat(); // o/p - Eating
		
		/*
		 The super keyword in java is a reference variable which is used
		 to refer immediate parent class object
		 
		*/
		
	}
}

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println(d.color); // color or the child - dog - white 
		d.call();
		d.eat();  // o/p - Eating meat
	
		/*
		Animal a = new Dog();
		System.out.println(a.color);  // always looks for the reference animal - brown 
		*/

	}

}
