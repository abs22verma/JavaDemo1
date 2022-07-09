import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		/*
		 * Name : Abhishek
		 * LastName : Verma
		 * Dept : QA
		 * 
		 * It will store in form of key value pair
		 * Key can not be duplicate
		 * Values can be duplicate
		 * we can store null as a key
		 * insertion order dosen't maintain
		 * 
		 */
		Map<String, String> map  = new HashMap<>();
		map.put("FirstName","Abhishek");
		map.put("lastName", "Verma");
		map.put(null, "Test");
		map.put("Test", null);
		
		System.out.println(map);
		
		System.out.println(map.get("lastName"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.remove(null));
		System.out.println(map.put("Test", "Abhi"));
		//map.re
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		

	}

}
