package AbstractClasss;

abstract class figure {
	double dim1;
	double dim2;

	public figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area();
}

class rectangle extends figure {

	public rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub

	}

	@Override
	double area() {
		System.out.println("Inside area of rectangle");
		return dim1 * dim2;
	}

}

class triangle extends figure {

	public triangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		System.out.println("Inside area of triangle");
		return dim1 * dim2 / 2;
	}

}

public class AbstractClassAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rectangleObject = new rectangle(10, 10);
		triangle triangleObject = new triangle(10, 10);
		figure figureReference;

		figureReference = rectangleObject;
		System.out.println("Rectangle: " + figureReference.area());

		figureReference = triangleObject;
		System.out.println("Triangle: " + figureReference.area());

	}

}
