package com.tst.ws;

import javax.jws.WebService;

@WebService(name = "ProductCatalogSEI", targetNamespace = "http://ws.tst.com/")
public interface ProductCatalogSEI {

	public abstract String getProductDescription(int ID, int TypeID);

}