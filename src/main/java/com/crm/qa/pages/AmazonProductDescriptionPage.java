package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AmazonProductDescriptionPage extends TestBase{

	
	@FindBy(id="add-to-cart-button")
	WebElement addToCartButton;

	@FindBy(id="priceblock_dealprice")
	WebElement priceText;
	
	public AmazonProductDescriptionPage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
	
	public void readProductPrice() throws InterruptedException {
		Thread.sleep(5000);
		getWindowHandles(1);
		String itemPrice = priceText.getText();
		System.out.println("The price of the selected item is:"+itemPrice);
		clickAddToCart();
	}
}
