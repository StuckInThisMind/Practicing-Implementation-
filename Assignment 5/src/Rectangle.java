
public class Rectangle implements Shape {

	private double l;
	private double b;
	
	public Rectangle(double l , double b)
	{
		this.l = l;
		this.b = b;
	}
	
	@Override
	public double caclulateArea() {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	public double caclulatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}

	
}
