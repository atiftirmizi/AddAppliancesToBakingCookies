package edu.project.appliances.command;

public class RemoteControl {
	public RemoteControl() {
		super();
	}

	ApplianceCommand applianceCommand;
	
	public void setCommand(ApplianceCommand applianceCommand) {
		this.applianceCommand = applianceCommand;
	}
	
	public void onButtonPressed() {
		applianceCommand.execute();
	}
}
