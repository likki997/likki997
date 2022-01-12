package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

      private static ApplicationContext context;

      public static void main(String[] args) {

            context=new ClassPathXmlApplicationContext("bean.xml");

            Address1 address=(Address1) context.getBean("Address1");
            address.display();

            Customer1 customer=(Customer1) context.getBean("Customer1");
             customer.display();
             
             
         }

}
