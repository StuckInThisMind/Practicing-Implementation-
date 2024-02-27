
public class Assignment_5_main {

	public static void main(String[] args) {
		
		Circle c = new Circle(7);
		System.out.println("Area is " + c.caclulateArea());
		System.out.println("Area is " + c.caclulatePerimeter());

		Triangle t = new Triangle(3, 4, 5, 6);
	    System.out.println("Triangle Area: " + t.caclulateArea());
	    System.out.println("Triangle Perimeter: " + t.caclulatePerimeter());
	        
	     Rectangle r = new Rectangle(4, 5);
	     System.out.println("Rectangle Area: " + r.caclulateArea());
	     System.out.println("Rectangle Perimeter: " + r.caclulatePerimeter());		
	}

}
