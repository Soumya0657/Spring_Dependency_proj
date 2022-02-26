package org.btm.dependencyApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Icar c1=(Icar)context.getBean("bm");
		c1.drive();
		Icar c2=(Icar)context.getBean("nn");
		c2.drive();
		
		
		

	}

}
