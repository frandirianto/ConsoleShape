package before.MyShape;

/**
 * A test class, Java course at <strong><em>Xidian University,Xi'an</em></strong>.
 * @author Dash Wong
 * 
 * */
public final class Rectangle extends Shape {
	private int height, width;
	
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
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.print("**********\n"
				       + "*        *\n"
				       + "*        *\n"
				       + "**********\n");
	}

}
