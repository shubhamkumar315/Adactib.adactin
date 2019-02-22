package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class titles {

	static WebDriver driver;
	
	@FindBy(xpath="//td[@class='login_title']")
	WebElement search_hotel_title;
	
	@FindBy(xpath="//td[@class='login_title']")
	WebElement select_hotel_title;
	
	@FindBy(xpath="(//td[@class='login_title'])[2]")
	WebElement book_a_hotel_title;
	
	@FindBy(xpath="//td[@class='login_title']")
	WebElement booking_confirmation_title;

	public WebElement getSearch_hotel_title() {
		return search_hotel_title;
	}

	public WebElement getSelect_hotel_title() {
		return select_hotel_title;
	}

	public WebElement getBook_a_hotel_title() {
		return book_a_hotel_title;
	}

	public WebElement getBooking_confirmation_title() {
		return booking_confirmation_title;
	}
	
	public titles( WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(driver, this);
	}
}
