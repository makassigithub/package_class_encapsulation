package pack1;

public class SamePackageNonSubclass {
	 // remember these are in the same package
	InitialClass ic = new InitialClass();
	
	SamePackageNonSubclass (){	
	System.out.println("Inside DifferentPackageNonSubclass");	
		
	// a non-subclass can access a public member through an encapsulation
	System.out.println("SamePackageNonSubclass_public_x = " + ic.public_x);
	
	// a non-subclass of the  can access a default member through an encapsulation
	System.out.println("SamePackageNonSubclass_default_x = " + ic.default_x);
	
	// a non-subclass of the  can access a protected member through an encapsulation
	System.out.println("SamePackageNonSubclass_protected_x = " + ic.protected_x);
	
	// Unless methods are provided(setters/getters) private members aren't accessible outside de class
	//System.out.println("private_x = " + private_x);
		
	}
}
