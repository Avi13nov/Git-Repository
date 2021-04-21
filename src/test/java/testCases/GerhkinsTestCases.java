package testCases;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class GerhkinsTestCases {
	
	public static WebDriver driver;
	

/*
	Feature: Verify login page

	Scenario: launch login page
	Given Chrome launch
	When enter user name
	When enter password
	Then click submit button */
	
	
	
@Given("^Chrome launch$")
public void chrome_launch() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha love you\\Desktop\\chromedriver\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 driver = new ChromeDriver();
	 options.addArguments("--disable-dev-shm-usage"); 
	
	
}
	
	@When("^enter user name$")
	public void enter_user_name() throws InterruptedException {
		
				 driver.get("http://104.211.230.220:8080/login");
				 Thread.sleep(4000);
		
	}
	@When("^enter password$")
	public void enter_password() { 
		
		driver.findElement(By.name("userName")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("12345678");
		}
	
	
	@Then("^click submit button$")
	public void click_submit_button() {
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/form/button[2]")).click();

}}
