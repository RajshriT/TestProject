package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass {
	
	
	@Test
	public void verifyLOgOutFunctionality() throws IOException
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickMenuButton();
		System.out.println("clicked on menu button");
		
		hp.clickLogOutButton();
		System.out.println("clicked on logoUt button");	
				
		ScreenshotClass.takeScreenshot(driver);
		System.out.println("apply the validation");
		
		  String expectedTitle = "Swag Labs";    //dev/BA
	
		   String actualTitle = driver.getTitle();
		  
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	

}

//	WebDriver driver;
////	//test steps
////	
//	@BeforeMethod
//	public void setUp() throws IOException
//
//		{
//			System.setProperty("webdriver.chrome.driver", "C:\\Selinum\\chromedriver_win32 (3)\\chromedriver.exe");
//
//			WebDriver driver = new ChromeDriver();
//			System.out.println("browser is opened");
//			
//			driver.manage().window().maximize();
//			System.out.println("browser is maximized");
//			
//			driver.get("https://www.saucedemo.com/");
//			System.out.println("SauceDemo URL is opened");
//			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			//take screesnhot
//			ScreenshotClass.takeScreenshot(driver);
//			
//
//			
//			//loginPage elements find +action perform
//			//loginfunctionality
//			LoginPOMClass x = new LoginPOMClass(driver);
//			x.sendUsername();
//			x.sendPassword();
//			x.clickOnLoginButton();
//			
//			//home-page
//			HomePOMClass y = new HomePOMClass(driver);
//			y.clickMenuButton();
//			y.clickLogOutButton();
//			
//			ScreenshotClass.takeScreenshot(driver);	
//		}		
//		
//			
//			//login-page
//			//test steps
//			@Test
//			public void verifyLOgOutFunctionality()
//			{
//
//			
//			System.out.println("apply the validation");
//			
//			   String expectedTitle = "Swag Labs";    //dev/BA
//				
//			   String actualTitle = driver.getTitle();
//			
//			if(expectedTitle.equals(actualTitle))
//			   {
//				System.out.println("logOut functionality test case is passed");
//			   }
//			else
//			   {
//				System.out.println("logOut functionality test case is failed");
//			   }
//			   }
//			@AfterMethod
//			public void tearDown()
//			{
//
//
//			driver.quit();
//		System.out.println("browser is closed");
//		
//		System.out.println("end of Program");
//
//				
//
//		
//	}


//}
