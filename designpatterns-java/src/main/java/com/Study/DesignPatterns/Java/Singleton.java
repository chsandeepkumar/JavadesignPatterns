package com.Study.DesignPatterns.Java;

public class Singleton {

	private Singleton()
	{

	}

	private static Logger loggerInstance;

	public static Logger getLoggerInstance() {

		if(loggerInstance==null)
			loggerInstance= new Logger();
		return loggerInstance;

	}

}
