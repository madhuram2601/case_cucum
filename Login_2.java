package com.test.casestudycucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_2 {
	WebDriver driver;
	@Given("Homepage")
	public void homepage() {
		 System.setProperty("webdriver.chrome.driver", "C:\\madhuram\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
	}

	@Given("clicks on SignIn")
	public void clicks_on_SignIn() {
		 driver.findElement(By.linkText("SignIn")).click();
	}

	@When("usernam in the field as {string}")
	public void usernam_in_the_field_as(String string1) {
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");
	}

	@When("passwor in the field as {string}")
	public void passwor_in_the_field_as(String string) {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@Then("clicks on the  login")
	public void clicks_on_the_login() {
		driver.findElement(By.name("Login")).click(); 
	}
}
