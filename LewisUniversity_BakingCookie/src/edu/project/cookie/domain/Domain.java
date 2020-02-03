package edu.project.cookie.domain;

import edu.project.appliances.command.ApplianceCommand;
import edu.project.appliances.command.RemoteControl;
import edu.project.appliances.types.AppliancesGeneralActions;
import edu.project.appliances.types.DishWasher;
import edu.project.cookie.decorator.AbstractCookie;
import edu.project.cookie.decorator.Cookie;
import edu.project.cookie.types.ButterCookie;
import edu.project.cookie.types.ChocolateChipCookie;
import edu.project.cookie.types.FruitCookie;
import edu.project.cookie.types.MixAndMatchCookie;


public class Domain {	
	
	
	public static void main(String[] args) {
		AbstractCookie cookie = new Cookie();
		AbstractCookie chocChipCookie = new ChocolateChipCookie(cookie);
		AbstractCookie butterCookie = new ButterCookie(cookie);
		AbstractCookie fruitCookie = new FruitCookie(cookie);
		AbstractCookie mixCookie = new MixAndMatchCookie(chocChipCookie, fruitCookie);
		
		System.out.println("The cost of the " + fruitCookie.getName() + " is: " + fruitCookie.getCost());
		System.out.println(butterCookie.getName());
		System.out.println(mixCookie.getDescription());
		
		/** ------------------------------------------------------------------------------------------ **/
		//Below is the Domain code for Appliances:
		
		//Instantiate Objects order:
		RemoteControl rc = new RemoteControl();
		AppliancesGeneralActions dishWasherGeneralActions = new DishWasher();
		ApplianceCommand command = new ApplianceCommand(dishWasherGeneralActions);
		
		
		rc.setCommand(command);
		rc.onButtonPressed();
	
	}

}
