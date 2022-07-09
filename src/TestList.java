import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		// List can contain hetrogeneous type of element
		// List maintain insertion order
		// Null is allowed
		// we can store duplicates value
		
		list.add("Abhi");//0
		list.add("Test");//1
		list.add('H');//2
		list.add(123);//3
		list.add(null);
		list.add(123);
		
		//[1,2,3,4,5,6]
		//[1,2,4,5,6]
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(3);
		System.out.println("--------------");
		list.add("C");
		list.add(3, 456);
		

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			if(list.get(i).equals("USA")) {
				
			}
		}
		
		System.out.println(list.contains("Abhi"));
		
		

	}

}
