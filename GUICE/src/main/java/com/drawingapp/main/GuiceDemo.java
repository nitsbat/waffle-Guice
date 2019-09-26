package com.drawingapp.main;

import com.drawingapp.requests.SquareReuest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Injector;

public class GuiceDemo {

	private static final String SQUARE_REQ = "SQUARE";

	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);
	}

	private static void sendRequest(String squareReq) {
//		DrawShape d = new DrawSquare();
		Injector injector = null;
		DrawShape d = injector.getInstance(DrawShape.class); 
		SquareReuest request = new SquareReuest(d);
		request.makeRequest();
	}

}
