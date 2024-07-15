package in.ac.jssateb.statickeyword;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.usn = 1;
		s1.name = "Abhijith";
		//s1.college = "JSS";  //REMOVED AFTER CREATING [static String college]
		
		Student s2 = new Student();
		s2.usn = 2;
		s2.name = "Abhishek";
		//s2.college = "JSS";
		
		System.out.println(s1.usn + " " + s1.name + " " + s1.college);
		System.out.println(s2.usn + " " + s2.name + " " + s2.college);
		// instead of calling this syso multiple time we can use :
		System.out.println(s1);
		// s1 is pointing to object hence we get output as "in.ac.jssateb.statickeyword.student@3fee733d"
		// hence we should convert it and point to value using twosring 
		// before generate twoString "in.ac.jssateb.statickeyword.Student@24273305"
		//  after generation of twoString "Student [usn=1, name=Abhijith, college=JSS]"
		// it provides more detailed output


	}

}
