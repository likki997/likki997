package com.Constructor;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloTest{
	
	public static void main(String[] args)
	        throws Exception
	    {
	 
	        ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("beanhello.xml");
	        cap.close();
	    }

   }


