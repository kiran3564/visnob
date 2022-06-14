package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resoooo.Baseclass;

public class Loginhomepage extends Baseclass {

	public WebDriver driver;
	
	By username= By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By loginbuton=By.xpath("//button[@id='btn_submit']");
	
	public Loginhomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

	


	public WebElement username()
	{
		return driver.findElement(username);
		
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement loginbutton()
	{
		return driver.findElement(loginbuton);
	}
}
