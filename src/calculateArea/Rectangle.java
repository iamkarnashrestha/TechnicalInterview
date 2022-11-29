package calculateArea;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}
