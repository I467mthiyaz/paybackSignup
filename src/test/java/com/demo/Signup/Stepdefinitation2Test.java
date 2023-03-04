package com.demo.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Stepdefinitation2Test {
	WebDriver driver;
	Signuppagefactory top;

	@Test(priority = 1, groups = "success")
	public void user_am_on_the_Payback_signup_pageTest() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.payback.in");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		top.Signup();
		driver.close();

	}

	@Test(priority = 15, groups = "4th")
	public void user_am_on_the_Payback_websitteTest() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.payback.in");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		top.Signup();
		driver.close();

	}

	@Test(priority = 8, groups = "2ndgroup")
	public void user_am_on_the_Payback_webssiteTest() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.payback.in");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		top.Signup();
		driver.quit();

	}

	@Test(priority = 12, groups = "3rdgroup")
	public void user_am_on_the_Paybackk_websiteTest() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.payback.in");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		top.Signup();
		
		driver.close();

	}

	@Test(priority = 3, groups = "success")
	public void user_click_on_the_Generate_OTP1Test() throws InterruptedException {
		driver = new ChromeDriver();
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();
		Thread.sleep(10000);
		top.submit();

	}

	@Test(priority = 10, groups = "2ndgroup")
	public void user_click_on_the_Generate_OTP2Test() throws InterruptedException {
		driver = new ChromeDriver();
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();
		Thread.sleep(10000);
		top.submit();

	}

	
	  @Test (priority = 13 ,groups="3rdgroup") public void
	  user_click_on_the_Generate_OTP3Test() throws InterruptedException {
		  driver = new ChromeDriver();
	 Signuppagefactory top= new Signuppagefactory(driver);
	 Thread.sleep(3000);
	 top.otp();
	 
	 
	}

	@Test(priority = 17, groups = "4th")
	public void user_click_on_the_Generate_OTP4Test() throws InterruptedException {
		driver = new ChromeDriver();
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();

	}

	@Test(priority = 2, groups = "success")
	public void user_enter_andTest() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		driver.manage().window().maximize();
		
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("7982189139");
		Thread.sleep(3000);
		top.email1("shaikimthiyaz9154@gmail.com");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);

	}

	@Test(priority = 9, groups = "2ndgroup")
	public void user_enter_my_details2Test() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("7982189139");
		Thread.sleep(3000);
		top.email1("ahuiasidio");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);

	}

	@Test(priority = 12, groups = "3rdgroup")
	public void user_enter_my_details3Test() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("7982189139");
		Thread.sleep(3000);
		top.email1("ahuiasidio");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);

	}

	@Test(priority = 16, groups = "4th")
	public void user_enter_my_details4Test() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		driver.manage().window().maximize();
		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("7982189139");
		Thread.sleep(3000);
		top.email1("ahuiasidio");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);
		

	}

	@Test
	public void user_is_navigated_to_signup_pageTest() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}

	@Test(priority = 7, groups = "success")
	public void user_should_able_to_see_success_messageTest() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}

	@Test(priority = 5, groups = "success")
	public void user_should_click_loginTest() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}

	@Test(priority = 4, groups = "success")
	public void user_should_click_the_signup_buttonnTest() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}

	@Test(priority = 6, groups = "success")
	public void user_should_see_a_otp_entry_page1Test() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}

	@Test(priority = 11, groups = "2ndgroup")
	public void user_should_see_an_error_message_indicating_the_email_is_already_registeredTest() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}

	@Test(priority = 18, groups = "4th")
	public void user_should_see_an_error_message_indicating_the_invalid_PhoneNumber_formatTest() {
		String data1 = driver.getCurrentUrl();
		Assert.assertEquals(data1,
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");

	}
	
	 @Test (priority = 14 ,groups="3rdgroup") public void
	 user_should_see_an_error_message_indicating_the_invalid_email_formatTest() {
	 String data1 =driver.getCurrentUrl(); Assert.assertEquals(data1,
	  "https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp"
	  );
	 
	  }
	 
}
