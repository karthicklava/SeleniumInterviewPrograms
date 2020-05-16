package samples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchGoogleProgram {
	WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void search(){
		driver.findElement(By.name("q")).sendKeys("Hellow google",Keys.ENTER);
		System.out.println("First test runs successfully");
		
		
		
		
		
		
		
	}
	
	@AfterTest
	public void quitBrowser(){
		driver.quit();
	}

}
