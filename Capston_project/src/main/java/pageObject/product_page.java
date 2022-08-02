package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class product_page { 
	public WebDriver driver; 
	
	
	
	By prod_one = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[4]/form[1]/button[1]\r\n"); 
	By prod_two = By.xpath("(//button[@type='submit'][contains(.,'Add to cart')])[6]"); 
	By cart_link = By.xpath("//body/nav[1]/div[1]/div[3]/ul[1]/li[1]/a[1]");
	
	By Validate_Title = By.xpath("//a[@class='navbar-brand mx-auto'][contains(.,'Craft Online Shopping')]");
		
	
	public product_page(WebDriver driver2) {
		// TODO Auto-generated constructor stub 
		this.driver = driver2;
	}

		 
	
	public WebElement getprodone() {
		return driver.findElement(prod_one);  
	}
    
	public WebElement getprodtwo() {
		return driver.findElement(prod_two);
	} 
	public WebElement getCartLink() {
		return driver.findElement(cart_link);  
	
	}

	public WebElement getValidateTitle() {
		return driver.findElement(Validate_Title);
	}
	
	
}
