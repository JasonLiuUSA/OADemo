package com.jason.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	//如果有spring-test的dependency，则不用写new ClassPathXmlApplicationContext这个去指定由spring来测试了
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	//Spring test an action to configure struts2 with spring 
	@Test
	public void testBean() throws Exception{
		//testAction这个Bean，无需自己定义。它是由struts2自动把
		TestAction testAction = (TestAction) ac.getBean("testAction");
		System.out.println(testAction);
	}
	
	// Spring test SessionFactory to configure hibernate with spring
	@Test
	public void testSessionFactory() throws Exception{
		SessionFactory sesstionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sesstionFactory);
	}
	
	
	//test for transaction， hibernate的transaction
	@Test
	public void testTransaction() throws Exception{
		TestService testService = (TestService)ac.getBean("testService");
		testService.saveUser();
	}
	
	
}
