import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Can multiple dtatype
		//it can store null value
		//dosen't maintain insertion order
		//duplicates not allowed
		
		Set<Integer> s = new HashSet();
		s.add(123);
		s.add(234);
		s.add(789);
		s.add(456);
		
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().hashCode());
		}
		
		System.out.println(s.add(635));
		
		

	}

}
