package com.niladri_pvt_ltd.basics.utils;
import java.io.*;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		Random rand=new Random();
		int theid=rand.nextInt(1000);
		return theid;
	}
	
}
