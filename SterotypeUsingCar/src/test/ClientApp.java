package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/test.xml");
		Car c1= ap.getBean(Car.class);
		c1.carDetails();

	}

}
