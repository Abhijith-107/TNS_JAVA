package in.ac.jssateb.superkeyword;

  
class Animall{
	Animall(){
		System.out.println("Animal constructor");
	}
}

class Dogg extends Animall{
	Dogg(){
		//super();
		System.out.println("Dog constructor");
		//super();  [error] super - should be given 1st statement in the constructor 
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogg d = new Dogg(); // Animal thn Dogg constructor is called 
		/*
		Whenever you create the instance of subclass the instance of aprent class is created
		implicitly which is reffered by super class varable 
		*/
	}

}
