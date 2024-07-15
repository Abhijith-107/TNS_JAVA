package in.ac.jssateb.inheritance;

class Animall{
	void eat() {
		
	}
}

class Dogg extends Animall{
	void bark() {
		
	}
}

class Puppy extends Dogg{
	void weep() {
		
	}
}

/*
MultilevelInheritance :
A derived class will be inheriting a base class, and as well as the derived class also acts 
as the base class for other classes

A [Base class] <- B [Intermediatory class] <- c [Derived class]

*/
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animall a =new Animall();
		a.eat();
		
		Dogg d = new Dogg();
		d.eat();
		d.bark();
		
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
		
		Animall a1 = new Dogg();
		a1.eat();
		//a1.bark(); [error] only referenced class methods can be accessed
		
		Animall p1 = new Puppy(); 
		p1.eat();
		//p1.bark(); [error]
		//p1.weep(); [error]
		
		Dogg d1 = new Puppy();
		d1.bark();
		d1.eat();
		
		
		
		
	}

}
