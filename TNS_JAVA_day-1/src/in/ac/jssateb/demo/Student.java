package in.ac.jssateb.demo;

public class Student {
	
	// A variable is a name given to a memory location.
	
	/*
	Instance Variable: These variables are declared within a class but outside a method, 
	constructor, or block and always get a default value
	*/
	
	//instance variables 
	int usn;
	String name;
	float marks;
	char gender;
	
	/*
	Local Variable: These variables are declared within a method but 
	do not get any default value. 
	*/
	
	//local variable 
	void add(int id,String fullname ,float scores) {
		usn = id;
		name = fullname;
		marks = scores;
		//System.out.println(id);
	}
	
	// Constructor :
	 public Student(){
		
	}
	
	Student(int id , String fullname, float scores){
		usn = id;
		name = fullname;
		marks = scores;
		System.out.println(id +" "+fullname +" "+ scores);
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		//Initialization :
		
		// 1. using reference variable :
		
		s1.usn = 1;
		s1.name = "Abhijith";
		s1.marks = 100;
		s1.gender = 'm';    // for char[single_character] use ' ' 
		
		//syso = ctrl+spacebar
		System.out.println(s1.usn+" "+s1.name+" "+s1.marks);
		 
		// 2. using method : 
		
		Student s2 = new Student();
		s2.add(2,"Aju", 99);
		System.out.println(s2.usn+" "+s2.name+" "+s2.marks);
		
		// 3. using constructor : It is called when an instance of the class is created.
		
		/* 
		
		line 30
		
		1] name of constructor will be same as class name 
		2] they do not have Access modifiers
		
		Types of Constructors:
		1] No argument Constuctor 
		2] Argumented constructor
		*/
		Student s3 = new Student(3,"Anusha",100);
		
		
		
	}

}
