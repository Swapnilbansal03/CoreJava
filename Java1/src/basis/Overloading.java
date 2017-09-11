package basis;

public class Overloading {

	public static void print(int a, int b) {
		
		System.out.println("integer method");
	}
	
	public static void print(String a, String b) {
		System.out.println("String metfd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("d","dd");
	}

}

