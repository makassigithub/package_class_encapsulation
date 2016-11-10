package pack2;

public class TestClass2 {

	public static void main(String[] args) {
		
		new DifferentPackageSubclass ();
		System.out.println();
		new DifferentPackageNonSubclass();

	}
	/* OUTPUT
	 Inside InitialClass 
	InitialClass_public_x = 1
	InitialClass_default_x = 2
	InitialClass_protected_x = 3
	InitialClass_private_x = 4
	Inside  DifferentPackageSubclass
	public_x = 1
	protected_x = 3

	Inside InitialClass 
	InitialClass_public_x = 1
	InitialClass_default_x = 2
	InitialClass_protected_x = 3
	InitialClass_private_x = 4
	Inside DifferentPackageNonSubclass
	public_x = 1*/
}
