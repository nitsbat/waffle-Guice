package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;

public class SquareReuest {
	DrawShape d ;
	
	public SquareReuest(DrawShape d) {
		this.d = d;
	}
	
	public void makeRequest() {
		d.draw();
	}
}
