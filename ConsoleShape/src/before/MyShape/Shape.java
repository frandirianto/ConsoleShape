package before.MyShape;

/**
 * A test class, Java course at <strong><em>Xidian University,Xi'an</em></strong>.
 * @author Dash Wong
 * 
 * */
public abstract class Shape {
	/**
	 * shape type <code>RECTANGLE</code>
	 * @see #CIRCLE
	 * @see #TRIANGLE
	 * */
	public final static int RECTANGLE = 1;
	/**
	 * shape type <code>CIRCLE</code>
	 * @see #RECTANGLE
	 * @see #TRIANGLE
	 * */
	public final static int CIRCLE = 2;
	/**
	 * shape type <code>TRIANGLE</code>
	 * @see #CIRCLE
	 * @see #RECTANGLE
	 * */
	public final static int TRIANGLE = 3;
	
	/**
	 * specially used to convert shape type to string
	 * 
	 * @see #RECTENGLE
	 * @see #CIRCLE
	 * @see #TRIANGLE
	 * */
	public final static String[] shapeNames = {"NULL","Rectangle", "Circle", "Triangle"};
	
	/**
	 * get the class of "<code>Shape shape</code>"
	 *@param shape the given shape
	 */
	public static int getShapeClass(Shape shape){
		/* another solution
		if(shape instanceof Rectangle) return Shape.RECTANGLE;
		if(shape instanceof Circle) return Shape.CIRCLE;
		if(shape instanceof Triangle) return Shape.TRIANGLE;
		*/
		return shape.shapeClass;
	}
	
	/**
	 * the class of this shape
	 * @see #RECTENGLE
	 * @see #CIRCLE
	 * @see #TRIANGLE
	 * */
	protected int shapeClass;
	/**
	 * name of this shape
	 * */
	protected String name;
	
	/**
	 *set shape name
	 * @param name new shape name
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * get shape name
	 * 
	 * */
	public String getName(){
		return this.name;
	}
	
	/**
	 * draw the shape
	 * */
	public abstract void Draw();
}
