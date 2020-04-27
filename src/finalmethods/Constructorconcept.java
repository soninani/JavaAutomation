package finalmethods;

public class Constructorconcept {
	
	public Constructorconcept(){
		System.out.println("Default constructor");
	}
	public Constructorconcept(int i){
		System.out.println("Constructir with single par with the value of");
		System.out.println(i);
	}
	public Constructorconcept( int i, int j){
		System.out.println("Constructir with two par");
		System.out.println(i);
		System.out.println(j);
	}
	

	public static void main(String[] args) {
		Constructorconcept obj=new Constructorconcept();
		Constructorconcept obj1=new Constructorconcept(10);
		Constructorconcept obj2=new Constructorconcept(10,20);

	}

}
