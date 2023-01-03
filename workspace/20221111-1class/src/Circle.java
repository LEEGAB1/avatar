
public class Circle {
	private int radius;
	private final double pi = 3.14;
	


	public int getRadius() {
		return radius;
	}

	public double getPi() {
		return pi;
	}

	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return pi * radius * radius;
	}
	public double getRound() {
		return 2 * radius * pi;
	}
	
}
