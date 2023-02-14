package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


public class Car {
	@Qualifier("se")
	@Autowired
	private Engine engine;
	@Value("scropio")
	private String name;

		
	public void getDetails() {
		System.out.println("car details is ");
		System.out.println("car cc is "+engine.getCc());
		System.out.println("car name is "+name);
		
		
	}
	

}
