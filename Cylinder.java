//Cylinder.java



public class Cylinder implements Shapetd{
	private double radius;
	//radius
	public void setRadius(double radius){
		this.radius =radius;
	}
	
	public double getRadius(){
	return radius;
	}
	//height
	private double height;
	
	public void setHeight(double height){
		this.height =height;
	}
	
	public double getHeight(){
	return height;
	}
	public double tsurfaceArea(){
		return 2*Math.PI*radius*height;
	}
	public double csurfaceArea(){
		return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
	}

	public double volume(){
		return 4*Math.PI*Math.pow(radius,2)*height;
		
	
	}
}