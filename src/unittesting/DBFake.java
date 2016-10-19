package unittesting;

public class DBFake implements DataAccess {

	@Override
	public double getData(int i) {
		return 3.14159;
	}

}
