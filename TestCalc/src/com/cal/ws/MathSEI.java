package com.cal.ws;

import javax.jws.WebService;

@WebService(name = "MathSEI", targetNamespace = "http://ws.cal.com/")
public interface MathSEI {

	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	public abstract int multiply(int a, int b);

}