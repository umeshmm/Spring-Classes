package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Client_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load xml file and host it into ApplicationContext container
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/test.xml");
		//eager loading
			
			ap.getBean("t");
	}

}
