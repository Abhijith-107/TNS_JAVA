package in.ac.jssateb.inheritance;

/*
Inheritance means creating new classes based on existing ones,
It is the mechanism in Java by which one class is allowed to inherit the features
(fields and methods) of another class
*/

class Animal{
	void eat() {
		System.out.println("eating");
	}
}

// extends: it is used for inheritance purpose 

class Dog extends Animal{
	void bark() {
		
	}
}

// single inheritance : one parent one child class 

public class SingleIneritance {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		Dog d = new Dog();  // object of child
		d.eat();
		d.bark();
		
		Animal a1 = new Dog();   // object of child - reference of parent 
		a1.eat();  // only parent method of referenced method can be accessed
		
		// Dog d1 = new Animal();   -- cannot be done [error] parent taking access from child
		
		
		

	}

}
