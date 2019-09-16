package com.javaLive.inheritaceWithAbstract;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	AbstractParentBean childrenBean = (AbstractParentBean)context.getBean("childBean2");
    System.out.println("=====Child Bean====");
    System.out.println("Message ::" + childrenBean.getMessage());
    System.out.println("Title ::" + childrenBean.getTitle());
	context.registerShutdownHook();
}
}
