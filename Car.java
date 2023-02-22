package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("I will drive my car at");
	}
	
	public void applyBrake() {
		System.out.println("Apply brake to stop the car once i reach");
	}
	public void soundHorn() {
		System.out.println("Sound the horn to make way atleast");
	}
	public void isPuncture() {
		System.out.println("If punctured, Dont drive the car");
	}
	
	public static void main(String[] args) {
		
		Car vehicle=new Car();
		vehicle.driveCar();
		vehicle.applyBrake();
		vehicle.soundHorn();
		vehicle.isPuncture();
		
		
	}
	
	
	
}
