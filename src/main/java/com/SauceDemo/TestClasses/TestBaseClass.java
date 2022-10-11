package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;

import org.testng.annotations.Parameters;


public class TestBaseClass {
	WebDriver driver;
	Logger log= Logger.getLogger("SauceDemo1");
	
	@Parameters("browserName")
		@BeforeMethod
		public void setUp(String browserName)throws IOException
		{
		//public void setup()
//	{
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else
			{
				System.setProperty("webdriver.gecko.driver", "./DriverFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			PropertyConfigurator.configure("log4j.properties");			
			log.info("Browser is opened");

				
	//	System.setProperty("webdriver.chrome.driver",  "C:\\Selinum\\chromedriver_win32\\chromedriver.exe");
	//	driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			log.info("Browser is maximized");
			

			
			driver.get("https://www.saucedemo.com/");
			log.info("URL is opened");
			

			ScreenshotClass.takeScreenshot(driver);
			
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
			//login
			
			LoginPOMClass lp = new LoginPOMClass(driver);
			
		   lp.sendUsername();
		   log.info("Username is entered");
		
		   lp.sendPassword();
		   log.info("Password is entered");
		
		   lp.clickOnLoginButton();
		   log.info("Clicked on login button");
		

		}
		
		@AfterMethod
		public void tearDown() 
		{

			driver.quit();
			System.out.println("browser is closed");
			
		}

	}



