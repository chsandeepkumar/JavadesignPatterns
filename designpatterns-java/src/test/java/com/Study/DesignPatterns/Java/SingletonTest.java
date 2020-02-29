package com.Study.DesignPatterns.Java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

	@Test
	void testGetLoggerInstance() {

		Logger instance= Singleton.getLoggerInstance();
		Logger instane2= Singleton.getLoggerInstance();
		assertEquals(instance, instane2,"objects are not same");
	}

}
