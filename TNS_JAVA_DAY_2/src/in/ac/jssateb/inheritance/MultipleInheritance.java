package in.ac.jssateb.inheritance;

class Father{
	void snoring() {
		System.out.println("Yess!! i have habit of snoring ");
	}
}
class Mother{
	void snoring() {
		System.out.println("Yess!! i have habit of snoring ");
	}
}

/*
[error]

class You extends Father,Mother{
	void snoring(){
		
	}
}
*/


/*
Multiple Inheritance (Through Interfaces)
[ Please note that Java does not support multiple inheritances ] 
we can achieve multiple inheritances only through Interfaces

Class C is derived from interfaces A and B

A         B
|         |
-----------
     |
     C
     
 */
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
