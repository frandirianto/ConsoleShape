package after.MyShape;

import java.util.Scanner;

import after.scanner.MyScanner;

public final class Triangle extends Shape {
	
	private int edge1, edge2, edge3;
	private Scanner scan = MyScanner.getInstance();
	
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
	
	public Triangle newTriangle() {
		String name;
		System.out.print("[new Triangle]Enter a name> ");
		name = scan.next();
		
		return new Triangle(name);
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