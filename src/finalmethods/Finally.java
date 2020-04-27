package finalmethods;

public class Finally {

	public static void main(String[] args) {
	
		test1();

	}
	
	
	
	
	
	public static void test1(){
		int i=10;
		try {
			System.out.println("inside test method");
			int k=i/0;
			
		} catch (NoSuchFieldError e) {
			System.out.println("arthemntoc exception");
		}
		finally {
			System.out.println("finally run if exception handles");
		}
		
		}
}