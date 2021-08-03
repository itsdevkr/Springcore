package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"com/springcore/reference/refconfig.xml"});
		A a = (A) context.getBean("aref");
		B b = (B)context.getBean("bref");
		
		System.out.println(a);
		System.out.println(b);
	}

}
