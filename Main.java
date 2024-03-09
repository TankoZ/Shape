//Main.java
import java.util.*;

public class Main{
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Circle\n2.Sphere\n3.Cylinder ");
		System.out.println("Emter choice of shape: ");
		int choice =scan.nextInt();

		switch(choice){
			case 1:
				System.out.println("Emter radius of circle: ");
				double radius =scan.nextDouble();
		
				Circle circle= new Circle();
				circle.setRadius(radius);//Set value of radius
		
				System.out.println("Area of circle is: "+circle.area());
				System.out.println("Circumference of circle is: "+circle.perimeter());
				break;
			case 2:
				System.out.println("Emter radius of sphere: ");
				double radius1 =scan.nextDouble();
		
				Sphere sphere= new Sphere();
				sphere.setRadius(radius1);//Set value of radius
		
				System.out.println("Surface Area of sphere is: "+sphere.tsurfaceArea());
				System.out.println("Volume of sphere is: "+sphere.volume());
				break;
			case 3:
				System.out.println("Emter radius of cylinder: ");
				double radius2 =scan.nextDouble();
				System.out.println("Emter height of cylinder: ");
				double height =scan.nextDouble();
		
				Cylinder cylinder= new Cylinder();
				cylinder.setRadius(radius2);//Set value of radius
				cylinder.setHeight(height);//Set value of height
				
				System.out.println("Total  Surface Area of Cylinder is: "+cylinder.tsurfaceArea());
				System.out.println("Curved Surface Area of Cylinder is: "+cylinder.csurfaceArea());
				System.out.println("Volume of Cylinder is: "+cylinder.volume());
				break;
				
	}	
	}
}
