package com.jason.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jason.domain.User;

//把当前对象放入Spring容器中，使用@Service，括号和里面那个可以默认不写
@Service("testService")
public class TestService {
	
	//给hibernate注入spring容器中的SessionFactory
	@Resource
	//hibernate.SessionFactory
	private SessionFactory sessionFactory;
	
	//来管理事务
	@Transactional
	public void saveUser(){
		//hibernate use session to do things, 这个session不是新session，是当前存在的
		Session session = sessionFactory.getCurrentSession();
		session.save(new User());
		//int a = 1/0; 这会抛出异常，即使上面那个执行成功，也会被roll back,无法存入数据库中
		session.save(new User());
		
	}
}
