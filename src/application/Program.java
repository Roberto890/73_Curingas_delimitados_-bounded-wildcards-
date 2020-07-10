package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
	}
									//para funcionar mais de um tipo
	//esta falando que pode ser de shape ou de qualquer tipo que seja subtipo de shape
	//entao o metodo agora aceita lista de circulos
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
			System.out.println(""+ s.area());
		}
		return sum;
	}
}
