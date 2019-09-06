package com.test.casestudycucu;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmeapp {
	WebDriver driver;
	@Given("User launches TestMeApp")
	public void user_launches_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\madhuram\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
	}

	@And("User clicks on SignUp")
	public void user_clicks_on_SignUp() {
		driver.findElement(By.linkText("SignUp")).click();
		
	}

	@When("User Enters username as {string} in the field")
	public void user_Enters_username_as_in_the_field(String string) {
		 driver.findElement(By.id("userName")).sendKeys("madhuvahh");
		 driver.findElement(By.id("userName")).sendKeys(Keys.ENTER);
	}

	@And("User Enters firstname as {string} in the field")
	public void user_Enters_firstname_as_in_the_field(String string) {
		driver.findElement(By.id("firstName")).sendKeys("Mounika");
	}

	@And("User Enters lastname as {string} in the field")
	public void user_Enters_lastname_as_in_the_field(String string) {
		driver.findElement(By.id("lastName")).sendKeys("Rb");
	}

	@And("User Enters password as {string} in the field")
	public void user_Enters_password_as_in_the_field(String string) {
		 driver.findElement(By.id("password")).sendKeys("Mouni123");
	}

	@And("User Enters confirmpassword as {string} in the field")
	public void user_Enters_confirmpassword_as_in_the_field(String string) {
		 driver.findElement(By.id("pass_confirmation")).sendKeys("Mouni123");
	}

	@And("User clicks the {string} in the button")
	public void user_clicks_the_in_the_button(String string) {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@And("User enters email as {string} in the field")
	public void user_enters_email_as_in_the_field(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("mouni@gamil.com");
		 
	}

	@And("User enters the mobile number as {string} in the field")
	public void user_enters_the_mobile_number_as_in_the_field(String string) {
		 driver.findElement(By.id("mobileNumber")).sendKeys("1234567891");
	}

	@And("User selects the date as {string} in the field")
	public void user_selects_the_date_as_in_the_field(String string) {
		driver.findElement(By.xpath("//img[@title='Ch']")).click();
		 
		 WebElement month=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		 Select selMonth=new Select(month);
		 selMonth.selectByValue("4");
		 
		 WebElement year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		 Select selYear=new Select(year);
		 selYear.selectByValue("2000");
		 
		 
		 WebElement date=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		 date.findElement(By.linkText("20")).click();
	}

	@And("User enters the address as {string} in the field")
	public void user_enters_the_address_as_in_the_field(String string) {
		driver.findElement(By.id("address")).sendKeys("56,ngo_nagar");
	}

	@And("User selects the security question in the field")
	public void user_selects_the_security_question_as_in_the_field() {
		 WebElement drp= driver.findElement(By.id("securityQuestion"));
		 Select drop=new Select(drp);
		 drop.selectByIndex(2);
		
	}

	@And("User enters the answer as {string} in the field")
	public void user_enters_the_answer_as_in_the_field(String string) {
		 driver.findElement(By.id("answer")).sendKeys("mad");
	}

	@And("Click on Register button")
	public void click_on_Register_button() {
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("Login is displayed")
	public void login_is_displayed() {
	   System.out.println("Login is displayed");
	}
	
}
