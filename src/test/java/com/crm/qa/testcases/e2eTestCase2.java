package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AmazonHomePage;
import com.crm.qa.pages.AmazonProductDescriptionPage;
import com.crm.qa.pages.AmazonProductsPage;
import com.crm.qa.pages.FlipKartCartPage;
import com.crm.qa.pages.FlipKartHomePage;
import com.crm.qa.pages.FlipKartProductDescriptionPage;
import com.crm.qa.pages.FlipKartProductsPage;



public class e2eTestCase2 extends TestBase{
	public WebDriver driver;
	
	@BeforeTest
	public void openBroswer() {
		loadProperties();
		initialization();
		
	}
	
	@Test	
	public void e2eTest() throws InterruptedException {
		navigateToFlipkart();
		
		FlipKartHomePage hm =new FlipKartHomePage(driver);
		hm.searchItemOnHomePage(prop.getProperty("ProductName"));
		
		FlipKartProductsPage product= new FlipKartProductsPage(driver);
		product.clickOnTheFirstProductFromListOfProducts();
		
		FlipKartProductDescriptionPage productDescription = new FlipKartProductDescriptionPage(driver);
		productDescription.readProductPrice();
		
		FlipKartCartPage cart = new FlipKartCartPage(driver);
		cart.increaseTheProductQuantityInNums();
		
		//navigate to amazon 
		
		navigateToAmazon();
		
		AmazonHomePage am = new AmazonHomePage(driver);
		am.searchItemOnHomePage(prop.getProperty("ProductName"));
		
		AmazonProductsPage ap = new AmazonProductsPage(driver);
		ap.clickOnTheFirstProductFromListOfProducts();
		
		AmazonProductDescriptionPage apd = new AmazonProductDescriptionPage(driver);
		apd.readProductPrice();
		
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		closeBrowserWindow();
	}
	

}
