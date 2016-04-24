package com.cal.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.cal.com/", endpointInterface = "com.cal.ws.MathSEI", portName = "MathPort", serviceName = "MathService")
public class Math implements MathSEI  {	
	public int add (int a, int b){
		return a + b;
	}
	
	public int subtract (int a, int b){ 
		return a - b;
	}
	
	public int multiply (int a, int b){
		return a *b;
		
		//Just a comment for checking remote repository
		
		//As a 2nd Change
		
		//As a 3rd Change
	}
}

