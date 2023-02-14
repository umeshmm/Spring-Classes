package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/test.xml");

	}

}
