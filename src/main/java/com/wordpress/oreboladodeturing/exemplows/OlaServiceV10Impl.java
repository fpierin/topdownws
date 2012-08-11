package com.wordpress.oreboladodeturing.exemplows;

import com.wordpress.oreboladodeturing.exemplows.DizerOlaRequest;
import com.wordpress.oreboladodeturing.exemplows.DizerOlaResposta;
import com.wordpress.oreboladodeturing.exemplows.OlaServiceV10;

public class OlaServiceV10Impl implements OlaServiceV10 {

	public DizerOlaResposta dizerOla(final DizerOlaRequest parameters) {
		return new DizerOlaResposta("Olá " + parameters.getNome());
	}

}
