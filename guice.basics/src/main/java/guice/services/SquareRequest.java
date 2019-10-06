package guice.services;

import com.google.inject.Inject;

import guice.basics.DrawShape;

public class SquareRequest {
	DrawShape d;

	@Inject
	public SquareRequest(DrawShape d) {
		this.d = d;
	}

	public void makeRequest() {
		d.draw();
	}
}
