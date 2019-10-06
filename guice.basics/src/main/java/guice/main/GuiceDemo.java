package guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import guice.module.AppModule;
import guice.services.SquareRequest;

public class GuiceDemo {

	private static final String SQUARE_RED = "SQUARE";

	private static void sendRequest(String squareRed) {
		if (squareRed.equals(SQUARE_RED)) {
			Injector injector = Guice.createInjector(new AppModule());
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sendRequest(SQUARE_RED);

	}

}
