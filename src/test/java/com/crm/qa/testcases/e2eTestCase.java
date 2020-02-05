package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FlipKartCartPage;
import com.crm.qa.pages.FlipKartHomePage;
import com.crm.qa.pages.FlipKartProductDescriptionPage;
import com.crm.qa.pages.FlipKartProductsPage;



public class e2eTestCase extends TestBase{
	public WebDriver driver;
	
	@BeforeTest
	public void openBroswer() {
		loadProperties();
		initialization();
		navigateToFlipkart();
	}
	
	@Test	
	public void e2eTest() throws InterruptedException {
		
		FlipKartHomePage hm =new FlipKartHomePage(driver);
		hm.searchItemOnHomePage(prop.getProperty("ProductName"));
		
		FlipKartProductsPage product= new FlipKartProductsPage(driver);
		product.clickOnTheFirstProductFromListOfProducts();
		
		FlipKartProductDescriptionPage productDescription = new FlipKartProductDescriptionPage(driver);
		productDescription.readProductPrice();
		
		FlipKartCartPage cart = new FlipKartCartPage(driver);
		cart.increaseTheProductQuantityInNums();
	}
	
	@AfterTest
	public void closeBrowser() {
		closeBrowserWindow();
	}
	

}
