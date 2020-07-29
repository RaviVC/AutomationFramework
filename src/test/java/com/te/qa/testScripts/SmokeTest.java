package com.te.qa.testScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.te.qa.objectRepository.HomePage;
import com.te.qa.testBase.BaseTest;
import com.te.qa.utils.ExcelDataProvider;

public class SmokeTest extends BaseTest{
	
	
	@Parameters("Environment")
	@Test
	public void launch(String Environment) {
		
		  test = extent.createTest("Launch TE Application");
		  launchApp(CONFIG.getProperty("TE_URL"), Environment);
		  System.out.println(driver.getTitle());
	}
	
	@Test(dataProvider = "test1Data")
	public void excelTest(String username, String password) {
		test = extent.createTest("Excel test");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name = "test1Data")
	public Object[][] getData(){
		ExcelDataProvider exceldata = new ExcelDataProvider();
		String excelpath = System.getProperty("user.dir")+"\\Excel\\ExcelData.xlsx";
		Object data[][] = exceldata.testData(excelpath, "sheet1");
		return data;
	}
	
	

}
