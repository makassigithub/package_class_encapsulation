package pack1;

public class InitialClass {
    
	public int public_x = 1;
	int default_x = 2;
	protected int protected_x = 3;
	private int private_x = 4;
	
	public InitialClass (){
		System.out.println("Inside InitialClass ");
		System.out.println("InitialClass_public_x = " + public_x);
		System.out.println("InitialClass_default_x = " + default_x);
		System.out.println("InitialClass_protected_x = " + protected_x);
		System.out.println("InitialClass_private_x = " + private_x);
	}
}
