package guice.module;

import com.google.inject.AbstractModule;

import guice.basics.DrawShape;
import guice.basics.DrawSquare;
import guice.services.DrawSquareRequestSubClass;
import guice.services.SquareRequest;

public class AppModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
		bind(SquareRequest.class).to(DrawSquareRequestSubClass.class);
	}

}
