package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage { 
	
	public  WebDriver driver; 
	
	By RegisterBut = By.xpath("//input[contains(@value,'Register')]"); //object creation 
	
	
	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub     // used for value intaliztion 
		this.driver = driver2; 
	
	}


	public WebElement getRegbutton() {
		
		return driver.findElement(RegisterBut); //webelement
	}
}
