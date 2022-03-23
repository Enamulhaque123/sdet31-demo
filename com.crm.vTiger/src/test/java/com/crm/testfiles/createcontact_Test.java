package com.crm.testfiles;

import org.testng.annotations.Test;

public class createcontact_Test {
	
	@Test(groups="create")
	public void createcontact() {
		System.out.println("contact created");
	}
	@Test(groups = "smoke") 
		public void a1 () {
		System.out.println("a1 run");
	}
	
}
