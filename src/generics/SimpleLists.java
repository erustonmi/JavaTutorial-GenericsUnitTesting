package generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SimpleLists {

	public static void breakList(List l) {
		l.add(LocalDate.of(2016, 10, 19));
	}
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Fred");
//		l.add(LocalDate.of(2016, 10, 19));
		
		System.out.println(l);
		
		breakList(l);
		String s = l.get(0);
		System.out.println("Item 0 is " + s);
		s = l.get(1);
		System.out.println("Item 1 is " + s);
	}

}
