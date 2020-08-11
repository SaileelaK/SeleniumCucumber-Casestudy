package com.training.util;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		System.out.println("setup work goes here");

	}
	
	@After
	public void tearDown() {
		System.out.println("Teardown work goes here");
	}
}
