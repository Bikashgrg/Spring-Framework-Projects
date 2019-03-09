package com.bikash.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bikash.bean.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		// Old way of doing where we create object
		Employee emp = new Employee();
		emp.setEmpid(1);
		emp.setEname("Bikash");
		emp.setEaddress("Pune");
		
		System.out.println("Object Details: " +emp);
		*/
		
		/*
		// Spring Container(IOC):- way number 1
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e1 = factory.getBean("emp1",Employee.class);
		
		System.out.println("Employee Details: "+e1);
		*/
		
		// Spring Container(IOC):- way number 2
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1 = (Employee) context.getBean("emp1"); // can write like this also
		System.out.println("Employee Details: "+e1);
		
		// for destroying object
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
