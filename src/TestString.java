
public class TestString {

	public static void main(String[] args) {
		String str1 = "Abhi";
		String str2 = "Abhi";
		String str3 = new String("Abhi");
		String str4 = new String("Abhi");
		
		System.out.println(str1==str2);
		
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		str2 = "verma";
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);
		
		
		StringBuffer sb = new StringBuffer("Test");
		sb.append("123");
		
		System.out.println(sb);
		
		String s = "My name is Abhishek";
		
		String[] arr = s.split(" ");
		for(String t:arr)
		System.out.println(t);
		
		System.out.println(s.replace(" ", "_"));
		
		

	}

}
