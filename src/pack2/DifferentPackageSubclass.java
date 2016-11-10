package pack2;



public class DifferentPackageSubclass extends pack1.InitialClass {
	
	
	DifferentPackageSubclass (){
		
		System.out.println("Inside  DifferentPackageSubclass");
		
		// a subclass inherits the public members of the superclass even from a different package
		System.out.println("public_x = " + public_x); 
		
         // a subclass can't inherit the default members of the superclass if there are not in the same package
         //System.out.println("default_x = " + default_x); 
		
	   	// a subclass inherits the protected members of the superclass even from a different package
		 System.out.println("protected_x = " + protected_x);
		
    	// a subclass can't inherits the private members of the superclass
	    //	System.out.println("private_x = " + private_x); // 
	}



}
