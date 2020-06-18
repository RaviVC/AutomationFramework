package com.te.qa.testScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Parameters;

import com.te.qa.objectRepository.HomePage;
import com.te.qa.testBase.BaseTest;

public class SmokeTest extends BaseTest{
	
	
	@Parameters("Environment")
	@Test
	public void launch(String Environment) {
		
		  test = extent.createTest("Launch TE Application"); 
		  test.log(Status.PASS,"TE Application Launched Successfully");
		  
		  launchApp(CONFIG.getProperty("TE_URL"), Environment);
		  System.out.println(driver.getTitle());
		 
		
		
	}

}
