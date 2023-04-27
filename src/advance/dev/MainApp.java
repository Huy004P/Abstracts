package advance.dev;

import java.awt.Shape;
import java.util.Scanner;
import advance.dev.model.Circle;
import advance.dev.model.Rect;
import advance.dev.model.Triangle;

public class MainApp {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[5];
		input(shapes);
		print(shapes);

	}

	private static void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

	private static void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<shapes.length; i++) {
			System.out.println("1: Circle, 2: Rect, 3: Triangle");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				shapes[i] = intputCircle(sc);
				break;
			case 2:
				shapes[i] = inputRect(sc);
				break;
			case 3:
				shapes[i] = inputTriangle(sc);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
	}

	private static Shape inputTriangle(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhap a:");
		double a = sc.nextDouble();
		System.out.println("Nhap b:");
		double b = sc.nextDouble();
		System.out.println("Nhap c:");
		double c = sc.nextDouble();
		sc.nextLine();
		
		return (Shape) new Triangle(a, b, c);
	}

	private static Shape inputRect(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhap a:");
		double a = sc.nextDouble();
		System.out.println("Nhap b:");
		double b = sc.nextDouble();
		sc.nextLine();
		
		return (Shape) new Rect(a, b);
	}

	private static Shape intputCircle(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Nhap r:");
		double r = sc.nextDouble();
		sc.nextLine();
		
		return (Shape) new Circle(r);
	}

	}


