package after.MyConsoleShape;

import java.util.Scanner;

import after.MyShape.*;
import after.scanner.MyScanner;

public class ShapeUI{

	private int count;
	private Shape[] shapes;
	private Scanner scan;
	private Menu menu;

	public ShapeUI(){
		init();
		showHello();
		chooseMenu();
	}

	private void init() {
		menu = new Menu();
		count = 0;
		shapes = new Shape[20];
		scan = MyScanner.getInstance();
	}

	private void showHello(){
		System.out.print("****************\n"
				+ "*   Welcome!   *\n"
				+ "****************\n");
	}

	private void chooseMenu() {
		int choose = -1;
		while(true){
			menu.mainMenu();
			choose = MyScanner.scanInteger();
			if(choose == 1)
				showAll();
			else if(choose == 2)
				createShape();
			else if(choose == 3)
				searchShape();
			else if(choose == 4)
				drawShape();
		}
	}

	private void showAll(){
		System.out.format("Total %d shape(s).\n", count);
	}



	private void createShape(){
		if(count>20){
			System.out.println(" [*]cannot create new shape. the container is full(20 at most).");
			return;
		}
		menu.subMenu();
		chooseShape();
	}

	private void chooseShape() {
		int inputNumber = -1;
		inputNumber = MyScanner.scanInteger();
		if(inputNumber == 1) {	
			Rectangle rectangle = new Rectangle();
			shapes[count] = rectangle.newRectangle();
		}
		else if(inputNumber == 2) {
			Circle circle = new Circle();
			shapes[count] = circle.newCircle();
		}
		else if(inputNumber == 3) {
			Triangle triangle = new Triangle();
			int edge1=0, edge2=0, edge3=0;
			System.out.print("Enter edge 1 > ");
			edge1 = scan.nextInt();
			System.out.print("Enter edge 2 > ");
			edge2 = scan.nextInt();
			System.out.print("Enter edge 3 > ");
			edge3 = scan.nextInt();				
			triangle.setEdges(edge1, edge2, edge3);
			shapes[count] = triangle;

		}
		count++;
	}

	private void searchShape(){
		String name;
		System.out.print("Input The Name of Shape > ");
		name = scan.nextLine();

		for(int i=0; i<count; i++){
			if(shapes[i].getName().equals(name)){
				System.out.println("Found : "+(i+1)
						+" shapeClass: "
						+Shape.shapeNames[Shape.getShapeClass(shapes[i])]);
				return;
			}
		}
		System.out.println("Not found!");
	}

	private void drawShape(){
		int sn = -1;

		System.out.print("[draw shape]Enter the SN > ");
		sn = MyScanner.scanInteger();
		if(sn < count) {
			for(int i = 0; i < sn; i++){
				System.out.println("sn: "+(i+1)
						+" name: "+shapes[i].getName()
						+" shapeClass: "+Shape.shapeNames[Shape.getShapeClass(shapes[i])]);
				shapes[i].Draw();
			}
			System.out.println("*************end***************");
		}
	}
	
	public static void main(String[] args) {
		new ShapeUI();
	}
}