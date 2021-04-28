package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Facebooksteps {

	public WebDriver driver;

	@Given("To validate user is in facebook login page")
	public void to_validate_user_is_in_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("To validate user enter {string} and  {string}")
	public void to_validate_user_enter_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);

	}

	@When("To validate user enter usernames and  passwords")
	public void to_validate_user_enter_usernames_and_passwords(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> li = dataTable.asLists();
		List<String> l = li.get(1);
		String s1 = l.get(0);
		String s2 = l.get(1);
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);

	}

	@When("To validate user enter username and  password")
	public void to_validate_user_enter_username_and_password(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> mp = d.asMaps();
		Map<String, String> map = mp.get(2);
		String o1 = map.get("username");
		String o2 = map.get("password");
		driver.findElement(By.id("email")).sendKeys(o1);
		driver.findElement(By.id("pass")).sendKeys(o2);
	}

	@When("To validate user enter invalid username and invalid password")
	public void to_validate_user_enter_invalid_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("ganna");
		driver.findElement(By.id("pass")).sendKeys("12324");

	}

	@When("To validate user click the login button")
	public void to_validate_user_click_the_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Then("To validate user must be displayed with error msg")
	public void to_validate_user_must_be_displayed_with_error_msg() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("invalid attempt");
		} else {
			WebElement element = driver
					.findElement(By.xpath("//div[contains(text(),'email address or mobile number you ')]"));
			Assert.assertTrue(element.isDisplayed());

		}

	}

}
