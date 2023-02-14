package bean;


import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Engine {
	public Engine() {
		System.out.println("Engine is created");// TODO Auto-generated constructor stub
	}
	@Value("2500cc")
	private String cc;
	
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
}
