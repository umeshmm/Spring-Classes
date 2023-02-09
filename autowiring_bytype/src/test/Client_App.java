package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Client_App {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/test.xml");
		Car c1=(Car) ap.getBean("c");
		c1.getCarDetails();
		
	}

}
