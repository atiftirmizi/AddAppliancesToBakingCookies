package edu.project.appliances.types;

public class DishWasher extends AppliancesGeneralActions{
	public void on() {
		System.out.println("DishWasher Power is On");
	}
	
	public void off() {
		System.out.println("DishWasher Power is Off");
	}
	
	public void wash() {
		System.out.println("Washing the dishes");
	}
	
	public void dry() {
		System.out.println("Drying the dishes");
	}
	
}
