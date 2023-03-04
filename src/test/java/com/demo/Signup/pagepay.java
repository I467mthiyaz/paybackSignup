package com.demo.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pagepay

{
	WebDriver driver;
	Signuppagefactory top;

	@Test
	public void succesSuccessful_sign_up() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		driver.manage().window().maximize();

		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("9381280082");
		Thread.sleep(3000);
		top.email1("shaikimthiyaz9154@gmail.com");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);
		top.otp();
		Thread.sleep(10000);
		top.submit();
	}
	@Test
	public void Unsuccessful_sign_up_with_invalid_email() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
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
		top.email1("shaikimthiyaz94gma");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);
		top.otp();
	}
	@Test
	public void Unsuccessful_sign_up_with_invalid_existing_email() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
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
		top.otp();
	}
	@Test
	public void Unsuccessful_sign_up_with_invalid_phonenumber() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		driver.manage().window().maximize();

		Signuppagefactory top = new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("7982");
		Thread.sleep(3000);
		top.email1("shaikimthiyaz9154@gmail.com");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);
		top.otp();
	}
	
}
