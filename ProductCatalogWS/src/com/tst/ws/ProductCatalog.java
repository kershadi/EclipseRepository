package com.tst.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.tst.ws.model.Product;

@WebService(targetNamespace = "http://ws.tst.com/", endpointInterface = "com.tst.ws.ProductCatalogSEI", portName = "ProductCatalogPort", serviceName = "ProductCatalogService")
public class ProductCatalog implements ProductCatalogSEI  {

	public String getProductDescription(int ID, int TypeID )
	{
		return "Alaki";
	}
	
	public List<Product> getProducts(String productName){
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product("My book", "1234", 123.45));
		productList.add(new Product("Your book", "567890", 678.45));
		
		return productList;
	}
	
	//First Change

	
}
