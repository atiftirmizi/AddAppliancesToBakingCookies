package edu.project.appliances.command;

import edu.project.appliances.types.AppliancesGeneralActions;

public class ApplianceCommand implements CommandInterface{
	AppliancesGeneralActions appliances;
	
	public ApplianceCommand(AppliancesGeneralActions appliances) {
		super();
		this.appliances = appliances;
		
	}

	@Override
	public void execute() {
		appliances.on();
	}
	
	

}
