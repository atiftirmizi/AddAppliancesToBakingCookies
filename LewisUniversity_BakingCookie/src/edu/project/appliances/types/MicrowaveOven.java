package edu.project.appliances.types;

public class MicrowaveOven extends AppliancesGeneralActions{
	public void on() {
		isOn = true;
		System.out.println("MicrowaveOven Power is On");
	}
	
	public void off() {
		System.out.println("MicrowaveOven Power is Off");
	}
	boolean isOn = false;
	private double time = 0.0;
	
	public void setTemp(double time) {
		this.time = time;
		if(!isOn) {
			System.out.println("Please turn the Microwave on first");
		}else {
			System.out.println("The timer is set to: " +time);
		}
		
	}
	
	public double getTemp() {
		
		System.out.println("The temperature is: " + this.time);
		return this.time;
	}
}
