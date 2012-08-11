package com.wordpress.oreboladodeturing.exemplows;

import com.google.inject.AbstractModule;

/**
 * 
 * @author Felipe Pierin <felipe.pierin@yahoo.com.br>
 * 
 */
public class WebServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(OlaServiceV10.class).to(OlaServiceV10Impl.class);
	}

}
