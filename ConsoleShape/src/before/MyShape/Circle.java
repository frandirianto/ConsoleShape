package before.MyShape;

/**
 * A test class, Java course at <strong><em>Xidian University,Xi'an</em></strong>.
 * @author Dash Wong
 * 
 * */
public final class Circle extends Shape {
	/**
	 * radius of this Circle
	 * */
	private int radius;
	
	/**
	 * get a new Circle
	 */
	public Circle(){
		this.shapeClass = Shape.CIRCLE;
	}
	/**
	 * get a new Circle
	 * @param name new Circle name
	 */
	public Circle(String name){
		this.shapeClass = Shape.CIRCLE;
		this.name = name;
	}
	/**
	 * get a new Circle
	 * @param name new Circle name
	 * @param radius new Circle radius
	 */
	public Circle(String name, int radius){
		this.shapeClass = Shape.CIRCLE;
		this.name = name;
		this.radius = radius;
	}
	
	/**
	 * set current Circle radius
	 * @param radius new radius
	 * */
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	/**
	 * get current Circle radius
	 * */
	public int getRadius(){
		return this.radius;
	}
	
	public boolean equals(Circle circle){
		return circle.radius == this.radius;
	}
	
	@Override
	/**
	 * draw the Circle
	 * */
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.print("      **   \n"
				       + "    *    * \n"
				       + "    *    * \n"
				       + "      **   \n");
	}
}
