package com.rocketfuel.libertybell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App {
	
	static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main( String[] args )
    {
		LOG.debug("Hello {}!", "World");
        System.out.println( "Hello World!" );
    }
}
