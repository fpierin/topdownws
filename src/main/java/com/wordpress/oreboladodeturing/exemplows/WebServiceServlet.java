package com.wordpress.oreboladodeturing.exemplows;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;

import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

@Singleton
public class WebServiceServlet extends CXFNonSpringServlet {

	private static final long serialVersionUID = 1L;

	private final OlaServiceV10 olaServiceV10;

	@Inject
	public WebServiceServlet(final OlaServiceV10 olaServiceV10) {
		this.olaServiceV10 = olaServiceV10;
	}

	@Override
	protected void loadBus(final ServletConfig servletConfig) {
		super.loadBus(servletConfig);
		BusFactory.setDefaultBus(getBus());
		Endpoint.publish("/OlaService", olaServiceV10);
	}

}