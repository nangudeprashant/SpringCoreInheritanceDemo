package com.javaLive.inheritaceWithParentAsTemplate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		ChildBean parentBean = (ChildBean) context.getBean("childBean3");
		System.out.println("=====Child Bean====");
		System.out.println("Message ::" + parentBean.getMessage());
		System.out.println("Title ::" + parentBean.getTitle());
		context.registerShutdownHook();
	}
}
