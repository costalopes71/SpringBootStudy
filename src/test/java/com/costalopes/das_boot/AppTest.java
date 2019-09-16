package com.costalopes.das_boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.costalopes.das_boot.controller.HomeController;

public class AppTest {
	
	@Test
	public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Das Boot, reporting for duty");
	}
    
}
