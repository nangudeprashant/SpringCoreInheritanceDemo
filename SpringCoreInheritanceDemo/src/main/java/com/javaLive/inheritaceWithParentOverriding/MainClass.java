package com.javaLive.inheritaceWithParentOverriding;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	ParentBean parentBean = (ParentBean)context.getBean("parentBean1");
    System.out.println("=====Parent Bean====");
    System.out.println("Message ::" + parentBean.getMessage());
    System.out.println("Title ::" + parentBean.getTitle());
    ParentBean childrenBean = (ParentBean)context.getBean("childBean1");            
    System.out.println("=====Child Bean====");
    System.out.println("Message ::" + childrenBean.getMessage());
    System.out.println("Title ::" + childrenBean.getTitle());
	context.registerShutdownHook();
}
}
