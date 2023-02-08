package beans;

public class Car {
	private String carname;
	private int cost;
	
	public Car(String carname, int cost) {
		super();
		this.carname = carname;
		this.cost = cost;
	}


	public void getDetails() {
		System.out.println("car name is "+carname);
		System.out.println("car cost is "+cost);
	}
	

}
