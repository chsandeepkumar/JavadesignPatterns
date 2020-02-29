package com.designPatterns.java;

import com.Study.DesignPatterns.Java.Singleton;
import com.Study.DesignPatterns.Java.Logger;
public class Main {

	public static void main(String[] args) {
		Logger loggerInstance= Singleton.getLoggerInstance();
		
		loggerInstance.Displaymessage("Hello world");

	}

}
