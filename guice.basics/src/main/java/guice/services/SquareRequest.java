package guice.services;

import com.google.inject.Inject;

import guice.basics.DrawShape;

public class SquareRequest {
	

	@Inject
	DrawShape d;

	public void makeRequest() {
		d.draw();
	}
}
