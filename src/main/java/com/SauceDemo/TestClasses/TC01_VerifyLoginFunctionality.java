package com.SauceDemo.TestClasses;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;





	public class TC01_VerifyLoginFunctionality extends TestBaseClass
	{

		@Test
		public void verifyLoginFunctionality() throws IOException
		{		
			ScreenshotClass.takeScreenshot(driver);
			
		    log.info("apply the validation");

			
		   String expectedTitle = "Swag Labs";    //dev/BA	
		   String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);

		}
		
		

	}

//	WebDriver driver;	
//	@BeforeMethod
//	public void setUp() throws IOException
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Selinum\\chromedriver_win32 (3)\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		System.out.println("browser is opened");
//		
//		driver.manage().window().maximize();
//		System.out.println("browser is maximized");
//		
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("SauceDemo URL is opened");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		//take Screenshot
//		
//		ScreenshotClass.takeScreenshot(driver);
//		
//		//loginPage elements find +action perform
//		
//		LoginPOMClass x = new LoginPOMClass(driver);
//		
//		x.sendUsername();
//		System.out.println("username is entered");
//		
//		x.sendPassword();
//		System.out.println("Password is entered");
//		
//		x.clickOnLoginButton();
//		System.out.println("Clicked on login button");
//		
//		//--homePage--
//		
//		ScreenshotClass.takeScreenshot(driver);
//	}
//	
//	@Test
//	public void verifyLoginFunctionality() throws IOException
//	{
//
//		
//System.out.println("apply the validation");
//	
//		
//	   String expectedTitle = "Swag Labs";    //dev/BA
//		
//	   String actualTitle = driver.getTitle();
//	
//	if(expectedTitle.equals(actualTitle))
//	   {
//		System.out.println("login functionality test case is passed");
//	   }
//	else
//	   {
//		System.out.println("login functionality test case is failed");
//	   }
//	}
//@AfterMethod
//public void tearDown()
//{
//
//	driver.quit();
//System.out.println("browser is closed");
//
//System.out.println("end of Program");
//
//		
//	}
//
//}
//
//	


