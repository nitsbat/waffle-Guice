package guice.services;

import com.google.inject.Inject;

import guice.basics.DrawShape;

public class DrawSquareRequestSubClass extends SquareRequest {

	@Inject
	public DrawSquareRequestSubClass(DrawShape d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void makeRequest() {
		System.out.println("Calling the Sub Class");
		d.draw();
	}

}
