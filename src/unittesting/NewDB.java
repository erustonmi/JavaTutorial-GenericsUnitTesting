package unittesting;

public class NewDB implements DataAccess {

	@Override
	public double getData(int i) {
		System.out.println("New database driver!!!");
		return 3.14;
	}

}
