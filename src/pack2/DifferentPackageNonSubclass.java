package pack2;



public class DifferentPackageNonSubclass {
	
	 // remember these are in different packages
		pack1.InitialClass ic = new pack1.InitialClass();
		
	    DifferentPackageNonSubclass(){
		System.out.println("Inside DifferentPackageNonSubclass");	
		
		// a non-subclass of the  can access a public member through an encapsulation
		System.out.println("public_x = " + ic.public_x);
		
		// a non-subclass of the  can't access a default member outside the package
	    // System.out.println("default_x = " + ic.default_x);
		
		// a non-subclass of the  can access a protected member outside the package
		//System.out.println("protected_x = " + ic.protected_x);
		
		// Unless methods are provided(setters/getters) private members aren't accessible outside de class
		// Whether it's inside or outside the package
		//System.out.println("private_x = " + private_x);
			
	}

}
