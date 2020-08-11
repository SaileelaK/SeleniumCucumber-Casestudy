package com.training.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/main/resources/com/training/features"},
	     glue = {"com.training.steps","com.training.util"}, 
	     plugin = {
	                 "pretty", 
	                 "html:target/cucumber-html-report" , 
	                 "json:target/cucumber-json-report"
	             }, 
	     monochrome = true,
//	     tags= {"@sanity","~@telecom"}
	     tags= {"@login"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
