package Learnings.newGIthublearnings;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlogin {

	static WebDriver driver;
	static File f;
	static FileInputStream file;
	static Properties p;
	
	public static WebDriver getDriver() throws IOException
	{
		f=new File("Configfiles//BroserConfig.properties");
		file=new FileInputStream(f);
		p=new Properties();
		p.load(file);
		 
		String browsers= p.getProperty("browser");
		if(browsers.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
				
		}
		
		
		return driver;
		
		
		
		
	}

}
