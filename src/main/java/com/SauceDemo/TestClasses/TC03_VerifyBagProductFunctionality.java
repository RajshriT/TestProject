package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;

public class TC03_VerifyBagProductFunctionality extends TestBaseClass{
	
	

		@Test
		public void verifyBagProductFunctionality() throws IOException
		{
			
			//--homePage--//
			
			//bag product
			HomePOMClass hp = new HomePOMClass(driver);
			hp.clickBagButton();
			System.out.println("Bag product will get selected");
			
			ScreenshotClass.takeScreenshot(driver);
			
			//--validation--//
			String expectedProduct = "1";
			
			String actualProduct = hp.getTextFromAddToCart();
			System.out.println("actual product->"+actualProduct);
			
			System.out.println("apply validation");
			
			Assert.assertEquals(actualProduct, expectedProduct);

			
			}
		
		
		

	}

//WebDriver driver;
//	
//	@BeforeMethod
//	public void setUp() throws IOException
//	{
//
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
//		//take screesnhot
//		ScreenshotClass.takeScreenshot(driver);
//		
//
//		
//		//loginActivity
//		LoginPOMClass lp = new LoginPOMClass(driver);
//		lp.sendUsername();
//		lp.sendPassword();
//		lp.clickOnLoginButton();
//		System.out.println("login activity is performed");
//		
//		ScreenshotClass.takeScreenshot(driver);
//}
//	
//	@Test
//	public void verifyBagProductFunctionality()
//	{
//
//		//--homePage--//
//		
//		//bag product
//		HomePOMClass hp = new HomePOMClass(driver);
//		hp.clickBagButton();
//		System.out.println("Bag product will get selected");
//		
//	
//		
//		//--validation--//
//		String exceptedProduct = "1";
//		
//		String actualProduct = hp.getTextFromAddToCart();
//		System.out.println("actual product->"+actualProduct);
//		
//		System.out.println("apply validation");
//		
//		if(exceptedProduct.equals(actualProduct))
//		{
//			System.out.println("Bag product add to cart case is passed");
//		}
//		else
//		{
//			System.out.println("Bag product add to cart case is failed");
//		}
//	}
//	@AfterMethod
//	public void tearDown()
//	{
//
//		driver.quit();
//	System.out.println("browser is closed");
//	
//	System.out.println("end of Program");
//
//		}
//	
//}
//
//

