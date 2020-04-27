package Java;

public class Callbyrefcallbyvale {
	
	int p;
	int i=32;

	public static void main(String[] args) {
		
		Callbyrefcallbyvale obj=new Callbyrefcallbyvale();
	    obj.sum(10, 789);
	int i=obj.p;
	System.out.println(i);
	int l=obj.i;
	System.out.println(l);
	
	}
	
	
	public void sum(){
		
	}
	
    public void sum(int i, int j){
	int k=i*j;
	System.out.println(k);
		
	}

}
