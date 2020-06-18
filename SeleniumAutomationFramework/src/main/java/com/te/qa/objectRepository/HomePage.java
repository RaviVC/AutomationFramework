package com.te.qa.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how=How.XPATH,using="//input[@id='search-input']")
	public WebElement searchInputField;
	
	@FindBy(how=How.XPATH,using="//input[@value='Search by part # or keyword']")
	public WebElement searchIcon;
	
	public void SearchPartNumber(String PartNumber) {
		searchInputField.sendKeys(PartNumber);
		searchIcon.click();
	}
	
	public void SearchPartName(String PartName) {
		searchInputField.sendKeys(PartName);
		searchIcon.click();
	}

}
