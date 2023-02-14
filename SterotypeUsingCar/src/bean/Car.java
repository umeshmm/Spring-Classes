package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Car {
	public Car() {
		System.out.println("car object created");
	}
	@Value("tata safari")
	private String name;
	@Autowired
	private Engine e;
	
	public void carDetails() {
		System.out.println("car details is");
		System.out.println("car name is " + name);
		System.out.println("car cc is " +e.getCc());
		
	}

}
