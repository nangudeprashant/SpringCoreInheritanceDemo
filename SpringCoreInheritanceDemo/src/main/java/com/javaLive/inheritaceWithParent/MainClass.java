package com.javaLive.inheritaceWithParent;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	ParentBean parentBean = (ParentBean)context.getBean("parentBean");
    System.out.println("=====Parent Bean====");
    System.out.println("Message ::" + parentBean.getMessage());
    System.out.println("Title ::" + parentBean.getTitle());
    ParentBean childrenBean = (ParentBean)context.getBean("childBean");            
    System.out.println("=====Child Bean====");
    System.out.println("Message ::" + childrenBean.getMessage());
    System.out.println("Title ::" + childrenBean.getTitle());
	context.registerShutdownHook();
}
}
