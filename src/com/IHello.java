package com;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace="http://com.test")
public interface IHello {
	
	@WebMethod
	String geetHell(@WebParam(name = "name") String name);
	
	String geetList(@WebParam(name= "list") List<String> list);

}
