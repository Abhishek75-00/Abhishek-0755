package pac;

public class Animal implements AnimalEat , AnimalTravel  {
	
	
	public void eat() {
		System.out.println("animal is eating");
	}
	public void drink() {
		System.out.println("animal is drinking water");
	}
	
	
	public void sleep() {
		
		System.out.println("animal is sleeping ");
		
		
	}
	
	public void travel() {
		
		System.out.println("animal is travelling");
		
		
	}
	
	
	public void walk() {
		
		System.out.println("animal is walking");
	}
	public void Sprint() {
		System.out.println("animal is sprinting");
	}
	public void run() {
		System.out.println("animal is running");
	}
	
}
