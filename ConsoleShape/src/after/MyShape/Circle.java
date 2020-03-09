package after.MyShape;

import java.util.Scanner;

import after.scanner.MyScanner;

public final class Circle extends Shape {
	
	private int radius;
	private Scanner scan = MyScanner.getInstance();
	
	public Circle(){
		this.shapeClass = Shape.CIRCLE;
	}

	public Circle(String name){
		this.shapeClass = Shape.CIRCLE;
		this.name = name;
	}

	public Circle(String name, int radius){
		this.shapeClass = Shape.CIRCLE;
		this.name = name;
		this.radius = radius;
	}
	

	public void setRadius(int radius){
		this.radius = radius;
	}
	

	public int getRadius(){
		return this.radius;
	}
	
	public boolean equals(Circle circle){
		return circle.radius == this.radius;
	}
	
	public Circle newCircle() {
		int rad = 0;
		System.out.print("[new Circle]Enter a name> ");
		name = scan.nextLine();
		System.out.print("Enter radius> ");
		rad = MyScanner.scanInteger();
		return new Circle(name, rad);
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.print("      **   \n"
				       + "    *    * \n"
				       + "    *    * \n"
				       + "      **   \n");
	}
}
