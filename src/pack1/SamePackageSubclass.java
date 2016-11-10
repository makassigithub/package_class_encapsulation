package pack1;

public class SamePackageSubclass extends InitialClass {
	
	SamePackageSubclass (){
		System.out.println("Inside SamePackageSubclass");
		System.out.println("SamePackageSubclass_public_x = " + public_x); // a subclass inherits the public members of the superclass
		System.out.println("SamePackageSubclass_default_x = " + default_x); // a subclass inherits the default members of the superclass
		System.out.println("SamePackageSubclass_protected_x = " + protected_x);// a subclass inherits the protected members of the superclass
	//	System.out.println("private_x = " + private_x); // // a subclass can't inherits the private members of the superclass
	}

}
