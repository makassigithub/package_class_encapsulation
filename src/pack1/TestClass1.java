package pack1;

public class TestClass1 {
	
	public static void main(String...args){	
	       
            new InitialClass();
			System.out.println();
	        new SamePackageSubclass();
	        System.out.println();		
	        new SamePackageNonSubclass();
			
	
	}
     /*OUTPUT
      
Inside InitialClass 
InitialClass_public_x = 1
InitialClass_default_x = 2
InitialClass_protected_x = 3
InitialClass_private_x = 4

Inside InitialClass 
InitialClass_public_x = 1
InitialClass_default_x = 2
InitialClass_protected_x = 3
InitialClass_private_x = 4
Inside SamePackageSubclass
SamePackageSubclass_public_x = 1
SamePackageSubclass_default_x = 2
SamePackageSubclass_protected_x = 3

Inside InitialClass 
InitialClass_public_x = 1
InitialClass_default_x = 2
InitialClass_protected_x = 3
InitialClass_private_x = 4
Inside DifferentPackageNonSubclass
SamePackageNonSubclass_public_x = 1
SamePackageNonSubclass_default_x = 2
SamePackageNonSubclass_protected_x = 3
      */
}
