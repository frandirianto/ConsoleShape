package after.MyShape;

public abstract class Shape {
	
	public final static int RECTANGLE = 1;
	public final static int CIRCLE = 2;
	public final static int TRIANGLE = 3;
	
	public final static String[] shapeNames = {"NULL","Rectangle", "Circle", "Triangle"};
	
	public static int getShapeClass(Shape shape){
		return shape.shapeClass;
	}
	
	protected int shapeClass;
	
	protected String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract void Draw();
}
