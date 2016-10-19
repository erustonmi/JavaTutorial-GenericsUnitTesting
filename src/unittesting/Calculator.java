package unittesting;

public class Calculator {
	@Inject("dbservice")
	private DataAccess da;
	
	public double calculate(int x) {
		return da.getData(x) * 2.0;
	}
}
