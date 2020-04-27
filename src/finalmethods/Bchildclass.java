package finalmethods;

public class Bchildclass extends ConstructorAparentcalss {
	//global variables
		String name1;
		int age;
		
		public Bchildclass(String name,int age){
			
//this.name=name;
this.age=age;
name1=name;
			System.out.println(name);
			System.out.println(age);
		}

	public static void main(String[] args) {
		Bchildclass obj=new Bchildclass("tom", 45);

	}

}
