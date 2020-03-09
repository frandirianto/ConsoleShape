package after.MyShape;

import java.util.Scanner;

import after.scanner.MyScanner;

public final class Rectangle extends Shape {
	
	private int height, width;
	private Scanner scan = MyScanner.getInstance();
	
	public Rectangle(){
		this.shapeClass = Shape.RECTANGLE;
	}
	
	public Rectangle(String name){
		this.shapeClass = Shape.RECTANGLE;
		this.name = name;
	}
	
	public Rectangle(String name, int height, int width){
		this.shapeClass = Shape.RECTANGLE;
		this.name = name;
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setWidth(int width){
		this.height = width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public boolean equals(Rectangle rect){
		return rect.height == this.height &&
			   rect.width  == this.width;
	}
	
	public Rectangle newRectangle() {
		int h = 0, w = 0;
		System.out.print("[new Rectangle] Enter a name> ");
		name = scan.next();
		System.out.println("Input H  > ");
		h = MyScanner.scanInteger();
		System.out.println("Input W  > ");
		w = MyScanner.scanInteger();
		
		return new Rectangle(name, h, w);
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.print("**********\n"
				       + "*        *\n"
				       + "*        *\n"
				       + "**********\n");
	}

}
