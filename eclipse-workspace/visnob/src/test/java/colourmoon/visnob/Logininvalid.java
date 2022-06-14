package colourmoon.visnob;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Loginhomepage;
import pageobjects.allobjects;
import resoooo.Baseclass;

public class Logininvalid extends Baseclass {

	public WebDriver driver;
	public static Logger log =LogManager.getLogger(Navigateinstute.class.getName());
	
@BeforeTest
	
	public void open() throws IOException
	{
		driver=browserintialize();
		log.info("browser opened");
		driver.get("http://colormoon.in/visnobschool/authentication");
		log.info("url opened");
	}

@Test
public void validatehomepage() throws IOException
{

	Loginhomepage lp =new Loginhomepage(driver);
	lp.username().sendKeys("cmoon@gmail.com");
	lp.password().sendKeys("12345");
	driver.manage().window().maximize();
	lp.loginbutton().click();
	allobjects lps = new allobjects(driver);
	lps.institutions().click();
	log.info("logged in");

}
@AfterTest
public void teardown()
{
	driver.close();
	log.info("browser closed");
}
}
