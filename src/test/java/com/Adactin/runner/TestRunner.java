package com.Adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
	
	features="src/test/java/com/Adactin/feature/Adactin.feature",
	glue= {"com.Adactin.stepdefinition"},
	tags= {"@sce8"},
	dryRun=false
	//monochrome=true
	

	
	
	)
	

public class TestRunner {
	
			
}
