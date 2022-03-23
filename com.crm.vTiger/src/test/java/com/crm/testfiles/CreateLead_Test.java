package com.crm.testfiles;

import org.testng.annotations.Test;

public class CreateLead_Test {
	
	@Test(groups = "create")
	public void createlead() {
		System.out.println("lead created");
	}
	@Test(groups = "regression")
	public void b1 () {
		System.out.println("b1 run");
	}
}
