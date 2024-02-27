
public class Triangle implements Shape{

	private double l1;
	private double l2;
	private double h;
	private double b;
	
	
	
	public Triangle(double l1, double l2, double b, double h ) {
		this.l1 = l1;
		this.l2 = l2;
		this.h = h;
		this.b = b;
	}

	@Override
	public double caclulateArea() {
		// TODO Auto-generated method stub
		return 0.5*h*b;
	}

	@Override
	public double caclulatePerimeter() {
		// TODO Auto-generated method stub
		return l1+l2+b;
	}

	
	
}
