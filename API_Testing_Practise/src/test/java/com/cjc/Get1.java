package com.cjc;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get1 
{
	@Test
public void getdata() {
	
	String url=RestAssured.baseURI="https://reqres.in/api/users?page=2";
	
	Response res=RestAssured.get(url);
	
	int stcode=res.getStatusCode();
	System.out.println(stcode);
	
}
	
}
