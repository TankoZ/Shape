//Sphere.java


public class Sphere implements Shapetd{
	private double radius;
	
	public void setRadius(double radius){
		this.radius =radius;
	}
	
	public double getRadius(){
	return radius;
	}
	
	public double tsurfaceArea(){
		return 4*Math.PI*Math.pow(radius,2);
	}
	
	public double csurfaceArea(){
		return 1;
	}

	public double volume(){
		return (4*3)*Math.PI*Math.pow(radius,3);
	}
}