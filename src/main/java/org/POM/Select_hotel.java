package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	WebElement select_hotel;
	
	@FindBy(id="continue")
	WebElement continue_booking;
	
	@FindBy(xpath="//input[@value='Sydney']")
	WebElement location_verification;
	
	@FindBy(id="arr_date_0")
	WebElement checkin_verify;
	
	@FindBy(id="dep_date_0")
	WebElement checkout_verify;
	
	@FindBy(id="rooms_0")
	WebElement room_num_verify;
	
	@FindBy(id="room_type_0")
	WebElement room_type_verify;
	
	@FindBy(id="no_days_0")
	WebElement num_of_days;
	
	@FindBy(id="price_night_0")
	WebElement price_per_night;
	
	@FindBy(id="total_price_0")
	WebElement tptal_price;
	
	public WebElement getTptal_price() {
		return tptal_price;
	}

	public WebElement getSelect_hotel() {
		return select_hotel;
	}

	public WebElement getContinue_booking() {
		return continue_booking;
	}

	public WebElement getLocation_verification() {
		return location_verification;
	}

	public WebElement getCheckin_verify() {
		return checkin_verify;
	}

	public WebElement getCheckout_verify() {
		return checkout_verify;
	}

	public WebElement getRoom_num_verify() {
		return room_num_verify;
	}

	public WebElement getRoom_type_verify() {
		return room_type_verify;
	}

	public WebElement getNum_of_days() {
		return num_of_days;
	}

	public WebElement getPrice_per_night() {
		return price_per_night;
	}
	
	public Select_hotel( WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(driver, this);
	}
	
	

}
