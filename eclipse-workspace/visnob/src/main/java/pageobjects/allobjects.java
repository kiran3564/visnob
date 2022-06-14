package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allobjects {

	public WebDriver driver;
	
	By title =By.xpath("//img[@src='http://colormoon.in/visnobschool/uploads/app_image/logo.png']");
	
	By institutions =By.xpath("//span[normalize-space()='Institutions']");
	
	
	public allobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	}

	public WebElement title()
	{
		return driver.findElement(title);
	}
	
	public WebElement institutions()
	{
		return driver.findElement(institutions);
	}
}
