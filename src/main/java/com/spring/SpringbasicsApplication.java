package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {

		/*SpringApplication.run(SpringbasicsApplication.class, args);*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeController controller = (EmployeeController) context.getBean("employeeController");
		System.out.println(controller.createNewEmployee());

	}
}
