package generics;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("abc");
		list.add("def");
		list.add("ghi");
		
		
		for (Object obj : list) {
			String s = (String) obj;
			System.out.println(s);
		}
		
	}
}
