package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_page { 
	
	public  WebDriver driver; 
	
	By reg_uname = By.xpath("//input[contains(@type,'text')]");
	By reg_email = By.xpath("//input[contains(@type,'email')]");
	By reg_button = By.xpath("//input[contains(@type,'submit')]"); 
	
	
	public Registration_page(WebDriver driver2) {
		// TODO Auto-generated constructor stub 
		
		this.driver = driver2;
	}
	public WebElement getUname() {
		return driver.findElement(reg_uname);
	}
    public WebElement getregEmail() {
    	return driver.findElement(reg_email); 
    } 
    public WebElement getRegbut() {
    	return driver.findElement(reg_button); 
    }
}
