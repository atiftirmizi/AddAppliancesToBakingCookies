package edu.project.appliances.types;

public class KitchenStove extends AppliancesGeneralActions{
	public boolean isOn = false;
	public void on() {
		isOn = true;
		System.out.println("KitchenStove Power is On");
	}
	
	public void off() {
		System.out.println("KitchenStove Power is Off");
	}
	
	private double temp = 0.0;
	
	public void setTemp(double temp) {
		this.temp = temp;
		if(!isOn) {
			System.out.println("Please turn the Stove on first");
		}else {
			System.out.println("The temperature is: " +temp);
		}
		
	}
	
	public double getTemp() {
		
		System.out.println("The current temperature is: " + this.temp);
		return this.temp;
	}
	
}
