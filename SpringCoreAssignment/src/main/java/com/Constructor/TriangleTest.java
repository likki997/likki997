package com.Constructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleTest {

	public static void main(String[] args) 
	 {
	ApplicationContext context = new ClassPathXmlApplicationContext("beanT.xml");
	Triangle triangle = (Triangle) context.getBean("triangle");
	triangle.draw();
	 }

}
