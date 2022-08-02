package craftsoftware;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base { 
	public static WebDriver driver;
	
	public WebDriver intalizeBrowser() throws IOException {
	
	Properties p = new Properties();
    FileInputStream f = new FileInputStream("C:\\Users\\mahle\\Capston_project\\src\\main\\java\\data.properties");
	
    p.load(f); 
    p.getProperty("browser"); 
    String BrowserName = p.getProperty("browser");
	
   if (BrowserName.equals("chrome")) {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahle\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe"); 
	   driver  = new ChromeDriver();
   }
   
   else if (BrowserName.equals("firefox")) {
	   
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahle\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe"); 
	   driver = new FirefoxDriver();
   }
   
   else if (BrowserName.equals("IE")) {
	   //webdriver.edge.driver
   }
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
   return driver;
}
}