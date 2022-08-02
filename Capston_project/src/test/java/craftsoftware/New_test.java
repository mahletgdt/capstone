package craftsoftware;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.Cart_Page;
import pageObject.LandingPage;
import pageObject.Login_page;
import pageObject.Registration_page;
import pageObject.product_page;


public class New_test extends Base{

	
	@BeforeTest 
	public void browserapplication() throws IOException {
		
		driver = intalizeBrowser(); 
		driver.get("http://shop.icraftsoft.net:8095/");
		driver.manage().window().maximize(); 
	} 
	@Test 
	public void aLanding_test() {                    //Landing page
		LandingPage lan = new LandingPage(driver); 
		lan.getRegbutton().click(); 
	} 
	
	@Test 
	public void bRegistration_test() {
		//registration page
		Registration_page r = new Registration_page(driver); 
		r.getUname().sendKeys("Miki"); 
		r.getregEmail().sendKeys("miki@gmail.com");
		r.getRegbut().click();
		
		driver.navigate().back();
		driver.navigate().back(); 
	} 
	
	@Test 
	public void clogin_test() {
		//login page
		Login_page log = new Login_page(driver); 
		log.getLogintext().sendKeys("2503"); 
		log.getLoginbutton().click(); 
	} 
	@Test 
	public void dproduct_test() {
		
		//Product page
		product_page prod = new product_page(driver); 
		prod.getValidateTitle(); 
		prod.getValidateTitle().getText(); 
		Assert.assertEquals(prod.getValidateTitle().getText(), "Craft Online Shopping");
		prod.getprodone().click();
		prod.getprodtwo().click(); 
		prod.getCartLink().click(); 
	} 
	@Test 
	public void ecart_test() {
	
		//cart page 
		Cart_Page cart = new Cart_Page(driver);
		cart.getvalidateContbutt();
		Assert.assertTrue(cart.getvalidateContbutt().isDisplayed());
		cart.getbuyButton().click(); 	
		
	} 
	@AfterTest 
	public void terminate_browser() { 
	 driver.close();
	}
}
