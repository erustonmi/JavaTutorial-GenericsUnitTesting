package createageneric;

import java.awt.Color;
import java.util.Date;

public class TestPair {

	public static void main(String[] args) {
//		Pair<String> ps = new Pair<String>("Fred", "Jones");
//		Pair<Date> pd = new Pair<Date>(new Date(), new Date());
		
		Pair<Shoe> pshoe = new Pair<>(new Shoe(Color.RED, 9), new Shoe(Color.BLACK, 11));
		System.out.println("Pair matches? " + pshoe.matching());
		pshoe = new Pair<>(new Shoe(Color.RED, 9), new Shoe(Color.RED, 9));
		System.out.println("Pair matches? " + pshoe.matching());
	}

}
