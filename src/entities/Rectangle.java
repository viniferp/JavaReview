package entities;

public class Rectangle implements Shape{

	double length;
	double witdh;
	
	public Rectangle(double length, double witdh) {
		super();
		this.length = length;
		this.witdh = witdh;
	}

	public double getLength() {
		return length;
	}

	public double getWitdh() {
		return witdh;
	}

	@Override
	public double area() {
		return length * witdh;
	}
}
