package colourmoon.visnob;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Loginhomepage;
import resoooo.Baseclass;

public class login extends Baseclass {

	
	public static Logger log =LogManager.getLogger(login.class.getName());
	public WebDriver driver;
	
	
	@BeforeTest
	public void open() throws IOException
	{
		driver=browserintialize();
		log.info("browser opened");
		driver.get("http://colormoon.in/visnobschool/");
		log.info("url opened");
	}
	@Test
	public void signin() throws IOException
	{
		
		
		Loginhomepage lp =new Loginhomepage(driver);
				lp.username().sendKeys("cmoon@gmail.com");
				lp.password().sendKeys("123456");
				driver.manage().window().maximize();
				lp.loginbutton().click();
				log.info("logged in");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("browser closed");
	}
}
