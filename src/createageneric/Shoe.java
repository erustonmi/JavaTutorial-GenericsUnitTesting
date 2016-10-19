package createageneric;

import java.awt.Color;

public class Shoe implements Colored, Sized {
	private Color color;
	private int size;
	
	public Shoe(Color color, int size) {
		super();
		this.color = color;
		this.size = size;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
