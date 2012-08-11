package com.wordpress.oreboladodeturing.exemplows;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class GuiceServletConfig extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		final Injector createInjector = Guice.createInjector(new WebServiceModule());
		createInjector.createChildInjector(servletModule());
		return createInjector;
	}

	private ServletModule servletModule() {
		return new ServletModule() {
			@Override
			protected void configureServlets() {
				super.configureServlets();
				serve("/services/*").with(WebServiceServlet.class);
			}

		};
	}
}