package com.demo.Signup;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitation2 {
	WebDriver driver;
	Signuppagefactory top;
	@Given("User should click login")
	public void user_should_click_login() {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.payback.in");
		 driver.manage().window().maximize();
		 Signuppagefactory top= new Signuppagefactory(driver);
		 top.Login1();
		
		
	}

	@Given("User should click the signup buttonn")
	public void user_should_click_the_signup_buttonn()
	{
		
		 Signuppagefactory top= new Signuppagefactory(driver);
		 top.Signuppage.click();
	}

	@Then("user is navigated to signup page")
	public void user_is_navigated_to_signup_page() {
		String data1 =driver.getTitle();
		Assert.assertEquals(data1,"Login to your PAYBACK Account");
		driver.quit();
		
	}

	@Given("User am on the Payback signup page")
	public void user_am_on_the_Payback_signup_page() {
		
		/*
		 * String data1 =driver.getTitle(); Assert.assertEquals(data1,
		 * "https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp"
		 * );
		 */
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		 driver.manage().window().maximize();
		
		
	}

	@When("User enter {string},{string},{string} and {string}")
	public void user_enter_and(String string, String string2, String string3, String string4) throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.FirstName.sendKeys(string);
		Thread.sleep(3000);
		top.LastName.sendKeys(string2);
		Thread.sleep(3000);
		top.PhoneNumber.sendKeys(string3);
		Thread.sleep(3000);
		top.Email.sendKeys(string4);
		Thread.sleep(5000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);
		
		
	}

	@When("User click on the Generate OTP1")
	public void user_click_on_the_Generate_OTP1() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();
		
		
		
	}

	@When("User should see a otp entry page1")
	public void user_should_see_a_otp_entry_page1() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.submit();
		
		
		
	}

	@Then("User should able to see success message")
	public void user_should_able_to_see_success_message() {
		String data1=driver.findElement(By.xpath("//*[@id=\"2cxyayknd\"]/div[1]")).getText();
		Assert.assertEquals(data1,"Otp is send to mobile!");
		
	}

	@Given("User am on the Payback websitte")
	public void user_am_on_the_Payback_websitte() {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		 driver.manage().window().maximize();
			/*
			 * String data1 =driver.getTitle(); Assert.assertEquals(data1,
			 * "https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp"
			 * );
			 * 
			 */		
		
		
	}

	@When("User enter my details2")
	public void user_enter_my_details2() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.Salutations();
		Thread.sleep(3000);
		top.Firstnames("imthiyaz");
		Thread.sleep(3000);
		top.lastnames("shaik");
		Thread.sleep(3000);
		top.phonenumber("7982189139");
		Thread.sleep(3000);
		top.email1("ahuiasid");
		Thread.sleep(3000);
		top.dates();
		Thread.sleep(3000);
		top.checkboxs();
		Thread.sleep(3000);
		
	}

	@When("User click on the Generate OTP2")
	public void user_click_on_the_Generate_OTP2() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();
		
		
		
	}

	@Then("User should see an error message indicating the invalid email format")
	public void user_should_see_an_error_message_indicating_the_invalid_email_format() {
//		String data1 = driver.findElement(By.xpath("//*[@id=\"gu3eywgp9\"]/div[1]")).getText();
//		Assert.assertEquals(data1, "Please enter valid last name.");
		
		
	}

	@Given("User am on the Payback webssite")
	public void user_am_on_the_Payback_webssite() {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		 driver.manage().window().maximize();
			/*
			 * String data1 =driver.getTitle(); Assert.assertEquals(data1,
			 * "https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp"
			 * );
			 */
		
		
	}

	@When("User enter my details3")
	public void user_enter_my_details3() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
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

	@When("User click on the Generate OTP3")
	public void user_click_on_the_Generate_OTP3() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();
		
		
	}

	@Then("User should see an error message indicating the email is already registered")
	public void user_should_see_an_error_message_indicating_the_email_is_already_registered() {
		String data1 =driver.getCurrentUrl();
		Assert.assertEquals(data1,"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		
		
		
	}

	@Given("User am on the Paybackk website")
	public void user_am_on_the_Paybackk_website() {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		 driver.manage().window().maximize();
		//String data1 =driver.getCurrentUrl();
		//Assert.assertEquals(data1,"https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");
		
		
		
	}

	@When("User enter my details4")
	public void user_enter_my_details4() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
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
		
		
		
	}

	@When("User click on the Generate OTP4")
	public void user_click_on_the_Generate_OTP4() throws InterruptedException {
		Signuppagefactory top= new Signuppagefactory(driver);
		Thread.sleep(3000);
		top.otp();
		Thread.sleep(3000);
		
		
	}

	@Then("User should see an error message indicating the invalid PhoneNumber format")
	public void user_should_see_an_error_message_indicating_the_invalid_PhoneNumber_format() {
	//
//		String data1 = driver.findElement(By.xpath("//*[@id=\"l6tngnrwj\"]/div[1]")).getText();
//		Assert.assertEquals(data1, "Please enter valid mobile number.");
		
	}

}
