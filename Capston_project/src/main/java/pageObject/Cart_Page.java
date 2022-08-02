package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Page { 
	
	public WebDriver driver; 
	
	By buy_button = By.xpath("//input[contains(@value,'Buy Now')]"); 
	By validate_contbutt = By.xpath("//input[contains(@value,'Continue Shopping')]");
	
	public Cart_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub 
		this.driver = driver2;
		
	}

	public WebElement getbuyButton() { 
		return driver.findElement(buy_button);
	} 
	public WebElement getvalidateContbutt() {
		return driver.findElement(validate_contbutt);
	}
	
}
