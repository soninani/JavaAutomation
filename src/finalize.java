
public class finalize {
	public void finalize(){
		System.out.println("finalze method");
	}

	public static void main(String[] args) {
		finalize f1=new finalize();
		finalize f2=new finalize();
		
		f1=null;
		f2=null;
		
		System.gc();
		

	}

}
