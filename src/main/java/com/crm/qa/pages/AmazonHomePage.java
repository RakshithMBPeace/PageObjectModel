package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AmazonHomePage extends TestBase{

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath="input[@class='nav-input'][1]")
	WebElement searchIcon;
	
	// Initializing the Page Objects:
		public AmazonHomePage(WebDriver driver) {
			driver=this.driver;
			PageFactory.initElements(driver, this);
		}
		
		public void clickSearch() {
			searchIcon.click();
		}
		
		public void enterProductInProductsSearchBox(String productName) {
			searchBox.sendKeys(productName);
		}
		
		public void searchItemOnHomePage(String ProductName) throws InterruptedException {
			Thread.sleep(5000);
			enterProductInProductsSearchBox(ProductName);
			clickSearch();
		}
}
