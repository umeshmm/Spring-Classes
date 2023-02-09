package bean;

public class Car {
	private String name;
	private Engine e;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setE(Engine e) {
		this.e = e;
	}

	public void getCarDetails() {
		System.out.println("car name is "+name);
		System.out.println("car engine is "+e.getCc());
		
	}
	
}
