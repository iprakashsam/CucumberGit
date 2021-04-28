package org.objectrepo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpojo extends Baseclass {
	public Facebookpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({ 
		@FindBy(id="email"),
		@FindBy(name="email")
	
	})private WebElement username;
	   
	@FindAll({ 
		@FindBy(id="pass"),
		@FindBy(name="pass")
	}) private WebElement password;

	@FindAll({ 
		@FindBy(id="login"),
		@FindBy(name="login")
	}) private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}


}
