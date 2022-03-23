package com.crm.testfiles;

import org.testng.annotations.Test;

public class CreateProduct_Test {
	
	@Test (groups = "create")
	public void createproduct() {
		System.out.println("product created");
	}
	
	@Test (groups = "smoke")
	public void m1 () {
		System.out.println("m1 run");
	}
	@Test (groups = "regression")
	public void m2 () {
		System.out.println("m2 run");
	}

}
