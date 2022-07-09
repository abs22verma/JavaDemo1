import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		
//		for(String str:list) {
//			System.out.println(str);
//		}
		//[1,2,3,1,4,5,2,1,6,3,1,4]
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
