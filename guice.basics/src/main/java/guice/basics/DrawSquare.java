package guice.basics;

import com.google.inject.Inject;

import guice.annotations.ColorValue;
import guice.annotations.EdgeValue;

public class DrawSquare implements DrawShape {
	

	private String color;
	private int edge;
		
	@Inject
	public DrawSquare(@ColorValue String color,@EdgeValue int edge) {
		super();
		this.color = color;
		this.edge = edge;
	} 
	
	public void draw() {
		System.out.println("Inside the Drawing app with color "+color+ " and edge "+edge);
	}
}
