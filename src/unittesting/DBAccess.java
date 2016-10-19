package unittesting;

public class DBAccess implements DataAccess {

	@Override
	public double getData(int i) {
		System.out.println("Doing lots of database access...");
		return Math.random() * 10_000;
	}
}
