package resoooo;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver browserintialize() throws IOException
	{
		 prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\visnob\\src\\main\\java\\resoooo\\data.properties");
			
			prop.load(fis);												
			
			String browserName=prop.getProperty("browser");
			System.out.println(browserName);
			
			if(browserName.equals("chrome"))
			{
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\visnob\\drivers\\chromedriver.exe");
				driver= new ChromeDriver();
					//execute in chrome driver
				
			}
			else if (browserName.equals("firefox"))
				
			{
				 System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\visnob\\drivers\\geckodriver.exe");
				 driver= new FirefoxDriver();
				//firefox code
			}
		
			return driver;
	}
	public String getscreenshotpath(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source, new File(destinationfile));
		return destinationfile;
	}
}
