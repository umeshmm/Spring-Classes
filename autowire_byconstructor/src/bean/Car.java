package bean;

public class Car {
	
	private Engine engine;

	public Car(Engine engine) {
		
		this.engine = engine;
	}
	
	public void getDetails() {
		System.out.println("car details is ");
		System.out.println("car cc is "+engine.getCc());
		
	}
	

}
