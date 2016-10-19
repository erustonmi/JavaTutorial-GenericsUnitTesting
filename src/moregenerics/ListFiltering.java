package moregenerics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListFiltering {

	public static <E> List<E> filter(Iterable<E> input, Predicate<E> criterion) {
		List<E> output = new ArrayList<>();
		for(E s : input) {
			if (criterion.test(s)) {
				output.add(s);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Fred", "Jim", "Sheila", "William", "Alice");
		
		System.out.println("Long strings are: " + filter(ls, s -> s.length() > 4));
		System.out.println("Early strings are: " + filter(ls, s -> s.charAt(0) < 'M'));
		System.out.println("Short strings are: " + filter(ls, s -> s.length() < 4));
		
		List<LocalDate> lld = Arrays.asList(
				LocalDate.of(2016, 10, 10),
				LocalDate.of(2016, 8, 10),
				LocalDate.of(2016, 3, 10),
				LocalDate.of(2016, 11, 10),
				LocalDate.of(2016, 12, 10)
				);
		
		System.out.println("Future: " + filter(lld, d -> d.compareTo(LocalDate.now())>0));
		System.out.println("Past: " + filter(lld, d -> d.compareTo(LocalDate.now())<0));
	}

}
