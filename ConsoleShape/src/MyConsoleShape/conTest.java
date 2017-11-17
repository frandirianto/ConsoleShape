package MyConsoleShape;

import java.util.Scanner;
import java.util.InputMismatchException;

import MyShape.*;

public class conTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapeUI.conUI();
	}

}

/**
 * A test class, Java course at <strong><em>Xidian University,Xi'an</em></strong>.
 * @author Dash Wong
 * 
 * */
class shapeUI{
	private static int count = 0;
	private static Shape[] shapes = new Shape[20];
	
	private shapeUI(){} // prevent create instance
	
	public static void conUI(){
		int sel;
		showHello();
		while(true){
			sel = showMenu();
			switch(sel){
			case 1:
				showAll();
				break;
			case 2:
				createShape();
				break;
			case 3:
				searchShape();
				break;
			case 4:
				drawShape();
				break;
			case 0:
			default:
				System.out.println(" Bye.");
				System.exit(0);
			}
		}
	}
	
	private static void showHello(){
		System.out.print("****************\n"
				       + "*   Welcome!   *\n"
				       + "****************\n");
	}
	
	private static int showMenu(){
		int sel=0;
		System.out.print("****************\n"
				       + "*  Main  Menu  *\n"
				       + "*--------------*\n"
				       + "* 1.show all   *\n"
				       + "* 2.create     *\n"
				       + "* 3.search     *\n"
				       + "* 4.draw shape *\n"
				       + "* 0.exit       *\n"
				       + "****************\n");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				System.out.print("choice> ");
				sel = scan.nextInt();
			}catch(InputMismatchException e){
				scan.next();
				System.out.println(" [!]wrong choice. retry.");
				continue;
			}
			if(sel<0 || sel>4) continue;
			break;
		}
		
		return sel;
	}
	
	private static void showAll(){
		System.out.format("total %d shape(s).\n", count);
	}
	private static void createShape(){
		int sel=0;
		String name;
		
		if(count>20){
			System.out.println(" [*]cannot create new shape. the container is full(20 at most).");
			return;
		}
		System.out.print("****************\n"
				       + "*  Create Menu *\n"
				       + "*--------------*\n"
				       + "* 1.Rectangle  *\n"
				       + "* 2.Circle     *\n"
				       + "* 3.Triangle   *\n"
				       + "* 0.back       *\n"
				       + "****************\n");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				System.out.print("choice> ");
				sel = scan.nextInt();
			}catch(InputMismatchException e){
				scan.next();
				System.out.println(" [!]wrong choice. retry.");
				continue;
			}
			if(sel<0 || sel>3) continue;
			break;
		}
		switch(sel){
		case 1:
			int h=0, w=0;
			System.out.print("[new Rectangle]Enter a name> ");
			name = scan.next();
			while(true){
				try{
					System.out.print("Enter height,width> ");
					h = scan.nextInt();
					w = scan.nextInt();
				}catch(InputMismatchException e){
					System.out.println(" [!]wrong input.Retry.");
					scan.next();
					continue;
				}
				break;
			}
			shapes[count] = new Rectangle(name, h, w);
			count ++;
			break;
		case 2:
			int r=0;
			System.out.print("[new Circle]Enter a name> ");
			name = scan.next();
			while(true){
				try{
					System.out.print("Enter radius> ");
					r = scan.nextInt();
				}catch(InputMismatchException e){
					System.out.println(" [!]wrong input.Retry.");
					scan.next();
					continue;
				}
				break;
			}
			shapes[count] = new Circle(name, r);
			count ++;
			break;
		case 3:
			int a=0, b=0, c=0;
			System.out.print("[new Triangle]Enter a name> ");
			name = scan.next();
			while(true){
				try{
					System.out.print("Enter a,b,c> ");
					a = scan.nextInt();
					b = scan.nextInt();
					c = scan.nextInt();
					if(!Triangle.checkEdges(a, b, c)) throw new InputMismatchException("Wrong edges.");
				}catch(InputMismatchException e){
					System.out.println(" [!]wrong input.Retry.");
					if(!e.getMessage().equals("Wrong edges.")) scan.next();
					continue;
				}
				break;
			}
			Triangle tri = new Triangle(name);
			tri.setEdges(a, b, c);
			shapes[count] = tri;
			count ++;
			break;
		case 0:
			return;
		}
	}
	private static void searchShape(){
		String name;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("[search]Enter the name> ");
		name = scan.next();
		for(int i=0; i<count; i++){
			if(shapes[i].getName().equals(name)){
				System.out.println("Found. sn: "+(i+1)
						+" shapeClass: "
						+Shape.shapeNames[Shape.getShapeClass(shapes[i])]);
				return;
			}
		}
		System.out.println("Not found!");
	}
	private static void drawShape(){
		int sn=0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				System.out.print("[draw shape]Enter the SN> ");
				sn = scan.nextInt();
				if(sn > count) throw new InputMismatchException("tooBig");
			}catch(InputMismatchException e){
				if(e.getMessage().equals("tooBig"))
					System.out.println(" [!]SN number too big, no enough shapes.");
				else{
					System.out.println(" [!]wrong input. retry."); 
					scan.nextLine();
				}
				continue;
			}
			break;
		}
		for(int i=0; i<sn; i++){
			System.out.println("sn: "+(i+1)
					+" name: "+shapes[i].getName()
					+" shapeClass: "+Shape.shapeNames[Shape.getShapeClass(shapes[i])]);
			shapes[i].Draw();
		}
		System.out.println("*************end***************");
	}
}