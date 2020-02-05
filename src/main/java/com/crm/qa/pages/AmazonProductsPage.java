package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AmazonProductsPage extends TestBase{

	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'][1]")
	WebElement firstProduct;
	
	public AmazonProductsPage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTheFirstProductFromListOfProducts() throws InterruptedException {
		Thread.sleep(5000);
		firstProduct.click();
	}
}
