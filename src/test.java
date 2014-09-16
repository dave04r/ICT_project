
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.err.println("Error Test");
		test(5);
	}

	public static int test(int x) {
		
		System.out.println("Test function called with: " + x);
		
		return x*x;
		
	}
	
}
