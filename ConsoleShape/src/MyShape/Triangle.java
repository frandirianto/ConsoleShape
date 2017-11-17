package MyShape;

/**
 * A test class, Java course at <strong><em>Xidian University,Xi'an</em></strong>.
 * @author Dash Wong
 * 
 * */
public final class Triangle extends Shape {
	private int edge1, edge2, edge3;
	
	public Triangle(){
		this.shapeClass = Shape.TRIANGLE;
	}
	public Triangle(String name){
		this.shapeClass = Shape.TRIANGLE;
		this.name = name;
	}
	
	public boolean setEdges(int edge1, int edge2, int edge3){
		if(!Triangle.checkEdges(edge1, edge2, edge3)){
			return false;
		}
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
		return true;
	}
	public int[] getEdges(){
		int[] edges = {this.edge1, this.edge2, this.edge3};
		return edges;
	}
	
	public static boolean checkEdges(int edge1, int edge2, int edge3){
		if(edge1>0 && edge2>0 && edge3>0 &&
		   edge1 + edge2 > edge3 &&
		   edge1 + edge3 > edge2 &&
		   edge3 + edge2 > edge1)   return true;
		
		return false;
	}
	
	public boolean equals(Triangle tri){
		return (tri.edge1+tri.edge2+tri.edge3 == edge1+edge2+edge3 &&
		        tri.edge1*tri.edge2*tri.edge3 == edge1*edge2*edge3);
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.print("     *     \n"
				       + "    * *    \n"
				       + "   *   *   \n"
				       + "  *     *  \n"
				       + " ********* \n");
	}

}