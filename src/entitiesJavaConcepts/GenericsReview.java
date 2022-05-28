package entitiesJavaConcepts;

import java.util.List;

import entities.Shape;

public class GenericsReview {
	
	//Method to return area´s sum from a list of figures.(Squares, Rectangles)
	public static double figuresListArea(List<? extends Shape> figures) {
		double area = 0d;
		
		for (Shape shape : figures) {
			area += shape.area();
		}
		return area;
	}
	
	//Method to copy elements from a list to another that can be more generic than the first one.
	public static List<Object> copy(List<? extends Number> source, List<Object> destiny) {
		destiny.addAll(source);
		
	return destiny;
	}
}
