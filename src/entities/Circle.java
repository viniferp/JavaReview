package entities;

public class Circle implements Shape {

	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
