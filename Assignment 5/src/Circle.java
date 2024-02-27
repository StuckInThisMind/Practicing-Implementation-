
public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius)
	{
		this.radius= radius;
	}
	
	@Override
	public double caclulateArea()
	{
		
		return radius*radius;
	}

	@Override
	public double caclulatePerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
	
}
