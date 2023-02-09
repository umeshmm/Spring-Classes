package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Client_app {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resouce/test.xml");
			Car c1=(Car) ap.getBean("car");
			c1.getDetails();

	}

}
