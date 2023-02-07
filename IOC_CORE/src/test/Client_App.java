package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Test;

public class Client_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load xml configuration file
		Resource r=new ClassPathResource("resource/test.xml");
		//load xml into IOC container(BeanFactory)
		BeanFactory f=new XmlBeanFactory(r);	//lazy loading
		Test t1=(Test) f.getBean("t");
		Test t2=(Test) f.getBean("t");
		Test t3=(Test) f.getBean("t");
		

	}

}
