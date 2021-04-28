package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.objectrepo.AdactinPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AdactinPage extends Baseclass {

	@Given("user is in adactin login page")
	public void user_is_in_adactin_login_page() {
		
		launchurl("http://adactinhotelapp.com/");
		
	}

	@When("user enter valid username and password in adactin page")
	public void user_enter_valid_username_and_password_in_adactin_page(io.cucumber.datatable.DataTable dataTable) {
		AdactinPojo a = new AdactinPojo();
		List<String> li = dataTable.asList();
		String s1 = li.get(0);
		String s2 = li.get(1);
		filltxtbox(a.getName(), s1);
		filltxtbox(a.getPass(), s2);

	}

	@When("user click the login button in adactin page")
	public void user_click_the_login_button_in_adactin_page() {
		AdactinPojo a = new AdactinPojo();
		btnclick(a.getLoginbtn());
	}

	@When("user enters the second page and search hotel")
	public void user_enters_the_second_page_and_search_hotel() {
		AdactinPojo a = new AdactinPojo();
		chooseBytxt(a.getLoc(), "Brisbane");
		chooseBytxt(a.getHotel(), "Hotel Hervey");
		chooseBytxt(a.getRoomtyp(), "Standard");
		chooseBytxt(a.getNoOfRoom(), "3 - Three");
		filltxtbox(a.getEntrydate(), "12/2/2021");
		filltxtbox(a.getExitdate(), "15/2/2021");
		chooseBytxt(a.getAdults(), "2 - Two");
		chooseBytxt(a.getChild(), "2 - Two");
		btnclick(a.getSearchbtn());

	}

	@When("user enters the third page and select hotel")
	public void user_enters_the_third_page_and_select_hotel() {
		AdactinPojo a = new AdactinPojo();
		btnclick(a.getBtn());
		btnclick(a.getContBtn());

	}

	@When("user enters the fourth page and book hotel")
	public void user_enters_the_fourth_page_and_book_hotel() {
		AdactinPojo a = new AdactinPojo();
		downscroll(a.getScroll());
		filltxtbox(a.getFrstname(), "gana");
		filltxtbox(a.getLstname(), "nathan");
		filltxtbox(a.getAdd(), "sithalapakkam,chennai-126");
		filltxtbox(a.getCardNo(), "1234567812345678");
		chooseBytxt(a.getCardType(), "VISA");
		chooseBytxt(a.getExpirymnth(), "February");
		chooseBytxt(a.getExpiryYear(), "2022");
		filltxtbox(a.getCvvNo(), "123");
		btnclick(a.getBookBtn());

	}

	@Then("user enters the last page and booking details is displayed")
	public void user_enters_the_last_page_and_booking_details_is_displayed() throws IOException {
		AdactinPojo a = new AdactinPojo();
		downscroll(a.getOrderNo());
		WebElement e = driver.findElement(By.name("order_no"));
		String aa = e.getAttribute("value");
		System.out.println("Order no is =" + aa);
		takeSS("adactin");

	}

}
