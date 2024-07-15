package in.ac.jssateb.statickeyword;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.usn=2;
		s1.name="suni";
		
		// Accessible without object instantiation
		/*
		
		we can access class in object using :
		-> change() -- directly accessing using name of ur method [possible only if main method is in same class as method declaration]
		-> Student.change();  -- using class name accessing
		-> s1.change();  -- object reference  
		
		 */
		s1.change(); // since we called s1.change 
		System.out.println(s1);  // we get "Student [usn=1, name=abhijnan, college=jss]"
	}

}
