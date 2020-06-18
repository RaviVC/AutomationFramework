package com.greatPro.qa.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.te.qa.testBase.BaseTest;

public class GreatITProAutomation_FindAllLinks extends BaseTest {
	int acount;
	
	@Test
	public void findTextLinks() {
		
		launchApp("https://www.greatpro.org/sign-in/", "prod");
		System.out.println(driver.getTitle());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement element: links) {
			String des = element.getAttribute("href");
			if(des=="ERRORS: Missing alternative text") {
				System.out.println("A");
			}		
		}	
			
	}
		
}

