package Java;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.html.parser.Element;

public class Arraylist {

	public static void main(String[] args) {
		
		
//		int i[]=new int[3];
//		i[0]=23;
//		i[1]=786;
//		i[2]=789;
//		System.out.println(i.length);
//		System.out.println(i[0]);
//		System.out.println(i[1]);
//		for (int j = 0; j < i.length; j++) {
//		System.out.println(j);	
//		}
//		
//		
//	
//
//			
//			ArrayList ar=new ArrayList();
//			ar.add(100);
//			ar.add("hjh");
//			ar.add(389.9809);
//			ar.add('j');
//			System.out.println(ar.size());
//			System.out.println(ar.get(0));
//			
//			for (int k = 0; k < ar.size(); k++) {
//				
//				System.out.println(ar.get(k));
//			}
//	
			
			Employee ei=new Employee("java", 35);
			Employee e2=new Employee("mahesh", 876);
			
			ArrayList<Employee> emp=new ArrayList<Employee>();
			
			emp.add(ei);
			emp.add(e2);
			System.out.println(emp.size());
			for (int i = 0; i < emp.size(); i++) {
				System.out.println(emp.get(i));
				
			}
			int num=0;
			while(emp.size()>num){
				System.out.println(emp.get(num));
				num++;
				
			}
Iterator<Employee> it=emp.iterator();
while(it.hasNext()){
	System.out.println(it.next());
	
}


Iterator<Employee>jk=emp.iterator();
while(jk.hasNext()){
	System.out.println(jk.next());
}
			
			
			//System.out.println(emp.get(0));
			
			
			
			
//			ArrayList<Character> ard=new ArrayList<Character>();
//			ard.add('s');
//			ard.add('s');
//			ard.add('h');
//	System.out.println(ard.size());
//			
//			int j=0;
//			while( 3>j){
//				System.out.println(ard.get(j));
//				j++;
//				
//			}
//			
//			
//			
//			
////			for (int j = 0; j < ard.size(); j++) {
////				System.out.println(ard.get(j));
////				
////			}
		
	}	
			
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	






























//		int i[]=new int[3];
//		i[0]=10;
//		i[1]=20;
//		i[2]=29;
//		System.out.println(i.length);
//		System.out.println(i[1]);
//		System.out.println(i[2]);
//
//	}
//	public  void array(){
//	
//	
//	ArrayList ar=new ArrayList();
//	ar.add(100);
//	ar.add("string");
//	ar.add('s');
//	ar.add(5476.8978);
//	System.out.println(ar.size());
//	System.out.println(ar.get(0));
//	System.out.println(ar.get(2));
//	
//	
//	Employee e1=new Employee("jahanavi", 23);
//	Employee e2=new Employee("jhjk", 23);
//	ArrayList<Employee>ard=new ArrayList<Employee>();
//	
//ard.add(e1);
//ard.add(e2);
//System.out.println(ard.add(e1));
//
//}
	

