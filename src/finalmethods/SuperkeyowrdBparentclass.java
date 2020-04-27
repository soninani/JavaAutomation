package finalmethods;

public class SuperkeyowrdBparentclass extends SuperkeyowrdAparentclass {
	
public SuperkeyowrdBparentclass(){
	super();
}
public SuperkeyowrdBparentclass(int i){
	super(i);
}
public SuperkeyowrdBparentclass(int i, int j){
	super(i,j);
}


	public static void main(String[] args) {
	
		SuperkeyowrdBparentclass obj=new SuperkeyowrdBparentclass();
		SuperkeyowrdBparentclass obj1=new SuperkeyowrdBparentclass(10);
		SuperkeyowrdBparentclass obj2=new SuperkeyowrdBparentclass(20,30);
	}

}
