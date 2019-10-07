package guice.module;

import com.google.inject.AbstractModule;

import guice.annotations.ColorValue;
import guice.annotations.EdgeValue;
import guice.basics.DrawShape;
import guice.basics.DrawSquare;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Yellow");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(50);
	}

}
