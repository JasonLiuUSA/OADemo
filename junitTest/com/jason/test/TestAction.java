package com.jason.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class TestAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("-->StrutSimpleActionTest.execute()");
		//这里返回的只是一个叫success的代号，这个会去match struts.xml里面的result name，
		//看哪个和这个代号match上，则转到那个result name的页面上。这样就不用写一长串URL在这里
		
       // int a=1/0;
		return "success";
	}
}
