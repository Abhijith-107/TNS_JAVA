package in.ac.jssateb.statickeyword;

public class Block {

	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		/*
		 output: 
		 -> static block
		 -> main method
		 when static block is used in prgm the static will be the 1st entry point [1st priority]
		 else usually "static void main" - 1st priority entry point
		 usually used in mobile etc where 1st the mobile shoud be on,os activated etc things that should run before any other process 
		 */
	}

}
