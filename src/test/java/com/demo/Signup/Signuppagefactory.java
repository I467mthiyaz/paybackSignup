package com.demo.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppagefactory {
	WebDriver driver = null;

	// @FindBy(xpath="//a[@data-clicktext='Login']")
	// WebElement Login;

	@FindBy(xpath = "//a[@data-clicktext='Login']")
	WebElement Login;
	@FindBy(xpath = "//a[@style='text-align: center; font-size: 17px; color: #b32b35; font-weight: bold;']")
	WebElement Signuppage;
	@FindBy(xpath = "//button[@class='reactCalenderBtn']")
	WebElement date;
	@FindBy(xpath = "//input[@id='tnc']")
	WebElement checkbox;
	@FindBy(xpath = "//select[@name='salutation']")
	WebElement hello;
	@FindBy(xpath = "//option[@value='1301']")
	WebElement salutation;
	@FindBy(xpath = "//*[@id=\"__next\"]/section/div/div[1]/div/div[2]/div[1]/input")
	WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;
	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement PhoneNumber;
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	WebElement Email;
	@FindBy(xpath = "//a[@class='text-white rounded border-0 px-2 py-2 px-lg-5 py-lg-2 main-bg d-block text-center text-uppercase fw-600 cursor-pointer']")
	WebElement GENERATEOTP;
	@FindBy(xpath = "//button[@class='text-white rounded border-0 px-2 px-md-5 py-2 px-lg-5 py-lg-2 main-bg text-uppercase fw-600']")
	WebElement Submits;

	public Signuppagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Salutations() {
		hello.click();
		salutation.click();
	}

	//     }
	public void dates() {
		date.click();
	}

	public void checkboxs() {
		checkbox.click();
	}

	public void otp() {
		GENERATEOTP.click();
	}

	public void Firstnames(String name) {
		FirstName.sendKeys(name);
	}

	public void lastnames(String lastn) {
		LastName.sendKeys(lastn);
	}

	public void phonenumber(String phone) {
		PhoneNumber.sendKeys(phone);
	}

	public void email1(String string3) {
		// TODO Auto-generated method stub
		Email.sendKeys(string3);

	}

	public void submit() {
		Submits.click();
	}

	public void Login1() {
		Login.click(); // TODO Auto-generated method stub

	}

	public void Signup() {
		Signuppage.click();
	}

}
