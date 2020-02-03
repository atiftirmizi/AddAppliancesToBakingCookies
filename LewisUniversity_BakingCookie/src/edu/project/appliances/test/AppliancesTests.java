package edu.project.appliances.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.project.appliances.command.ApplianceCommand;
import edu.project.appliances.command.RemoteControl;
import edu.project.appliances.types.AppliancesGeneralActions;
import edu.project.appliances.types.DishWasher;
import edu.project.appliances.types.KitchenStove;

class AppliancesTests {

	static RemoteControl rc;
	static KitchenStove stove;
	static ApplianceCommand command;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 rc = new RemoteControl();
		 stove = new KitchenStove();
		 command = new ApplianceCommand(stove);
	}

	@BeforeEach
	void setUp() throws Exception {
		
		stove.setTemp(30.0);
	}

	@Test
	void test() {
		double output = stove.getTemp();
		assertEquals(output,30.0);
	}
	
	

}
