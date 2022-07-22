package com.tech.anno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		ApplicationContext context=
//				new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext context=
//				new ClassPathXmlApplicationContext("com/tech/anno1/beans.xml");
		ApplicationContext context=
				new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("bean.xml file loaded");
		College college=context.getBean("college",College.class);
		System.out.println("This college obj create by spring is : "+college);
		college.test();
		
	}
}
 