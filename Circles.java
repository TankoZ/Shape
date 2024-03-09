//Circle.java


public class Circle implements Shape{
	private double radius;
	
	public void setRadius(){
		this.radius =radius;
	}
	
	public double getRadius(){
	return radius;
	}
	
	public double area(){
		return Math.PI*Math.pow(radius,2);
	}
	
	public double perimeter(){
		return 2*Math.PI*radius;
		
	
	}
}