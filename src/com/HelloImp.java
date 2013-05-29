package com;


import java.util.List;

import javax.jws.WebService;

import com.IHello;

@WebService(targetNamespace="http://com.test", portName="Hello2ImpPort")
public class HelloImp implements IHello{

	public String geetHell(String name) {
		// TODO Auto-generated method stub
		return "THIS CXF name="+name;
	}
	
	public String geetList(List<String> list){
		
		StringBuffer sappend= new StringBuffer();
		for(String en:list){	
			sappend.append("<table>"+en+"</table>");
		}
		
		return sappend.toString();
	}

}
