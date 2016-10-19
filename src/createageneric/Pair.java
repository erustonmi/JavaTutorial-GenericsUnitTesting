package createageneric;

public class Pair<E extends Sized & Colored> {
	
	static {
		System.out.println("Loading Pair class...");
	}
	
	{
		System.out.println("instance of Pair being created, class is " 
				+ this.getClass().getName());;
	}
	
	// CANNOT make static refs to class generic variables
//	public static E getNothing() {
//		return null;
//	}
	private E left;
	private E right;

	public E getLeft() {
		return left;
	}

	public void setLeft(E left) {
		this.left = left;
	}

	public E getRight() {
		return right;
	}

	public void setRight(E right) {
		this.right = right;
	}

	public Pair(E left, E right) {
		super();
		this.left = left;
		this.right = right;
	}

	public boolean matching() {
		return left.getColor().equals(right.getColor())
				&& left.getSize() == right.getSize();
	}
	
	@Override
	public String toString() {
		return "Pair [left=" + left + ", right=" + right + "]";
	}

}
