package org.objectrepo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo extends Baseclass {
	public AdactinPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement name;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement loginbtn;

	public WebElement getName() {
		return name;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	@FindBy(name = "location")
	private WebElement loc;
	@FindBy(name = "hotels")
	private WebElement hotel;
	@FindBy(name = "room_type")
	private WebElement roomtyp;
	@FindBy(name = "room_nos")
	private WebElement noOfRoom;
	@FindBy(name = "datepick_in")
	private WebElement entrydate;
	@FindBy(name = "datepick_out")
	private WebElement exitdate;
	@FindBy(name = "adult_room")
	private WebElement adults;
	@FindBy(name = "child_room")
	private WebElement child;
	@FindBy(name = "Submit")
	private WebElement searchbtn;
	@FindBy(id = "radiobutton_0")
	private WebElement btn;
	@FindBy(id = "continue")
	private WebElement contBtn;
	@FindBy(name = "first_name")
	private WebElement frstname;
	@FindBy(xpath = "//a[text()='Adactin.com']")
	private WebElement scroll;
	@FindBy(name = "last_name")
	private WebElement lstname;
	@FindBy(name = "address")
	private WebElement add;
	@FindBy(name = "cc_num")
	private WebElement cardNo;
	@FindBy(name = "cc_type")
	private WebElement cardType;
	@FindBy(name = "cc_exp_month")
	private WebElement expirymnth;
	@FindBy(name = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy(name = "cc_cvv")
	private WebElement cvvNo;
	@FindBy(name = "book_now")
	private WebElement bookBtn;
	@FindBy(name = "order_no")
	private WebElement orderNo;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtyp() {
		return roomtyp;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getEntrydate() {
		return entrydate;
	}

	public WebElement getExitdate() {
		return exitdate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getContBtn() {
		return contBtn;
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpirymnth() {
		return expirymnth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

}
