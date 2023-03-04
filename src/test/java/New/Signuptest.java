package New;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.Signup.Signuppagefactory;

public class Signuptest {
  @Test
  public void verification() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();//navigate to app
	  driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");//maximize the window
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  Signuppagefactory top= new Signuppagefactory(driver);
	 // top.Login1();
	  //Thread.sleep(2000);
	  //top.Signup();
	  //Thread.sleep(2000);
	  top.Salutations();
	  Thread.sleep(3000);
	  top.Firstnames("imithiyaz");
	  Thread.sleep(3000);
	  top.lastnames("shaik");
	  Thread.sleep(3000);
	  top.email1("shaikimthiyaz9154@gmail.com");
	  Thread.sleep(3000);
	  top.phonenumber("8186956653");
	  Thread.sleep(3000);
	  top.dates();
	  Thread.sleep(3000);
	  top.checkboxs();
	  Thread.sleep(3000);
	  top.otp();
	  Thread.sleep(10000);
	  top.submit();
	  
	  
	  
  }
}
