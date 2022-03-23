package com.crm.testfiles;

import org.testng.annotations.Test;

public class CreateOrg_Test {
	
	@Test(groups = "create")
	public void createorg() {
		System.out.println("org created");
	}
	
	@Test (groups = "smoke")
	public void abc () {
		System.out.println("abc run");
	}
	
	@Test (groups = "regression")
	public void abc1 () {
		System.out.println("abc1 run");
	}
}
