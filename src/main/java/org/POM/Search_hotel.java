package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	
	static WebDriver driver;
	
	@FindBy(name="location")
	WebElement city;
	
	@FindBy(id="hotels")
	WebElement hotel;
	
	@FindBy(id="room_type")
	WebElement roomtype;
	
	@FindBy(id="room_nos")
	WebElement room_num;
	
	@FindBy(id="datepick_in")
	WebElement chechin_date;
	
	@FindBy(id="datepick_out")
	WebElement checkout_date;
	
	@FindBy(id="adult_room")
	WebElement adult_room;
	
	@FindBy(id="child_room")
	WebElement child_room;
	
	@FindBy(id="Submit")
	WebElement submit;
	
	@FindBy(id="checkin_span")
	WebElement checkin_error;
	
	@FindBy(id="checkout_span")
	WebElement checkout_error;
	
	@FindBy(id="username_show")
	WebElement welcome_verification;
	
	

	

	public WebElement getCity() {
		return city;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoom_num() {
		return room_num;
	}

	public WebElement getChechin_date() {
		return chechin_date;
	}

	public WebElement getCheckout_date() {
		return checkout_date;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCheckin_error() {
		return checkin_error;
	}

	public WebElement getCheckout_error() {
		return checkout_error;
	}
	
	public WebElement getWelcome_verification() {
		return welcome_verification;
	}

	public Search_hotel(WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(Idriver, this);
		
	}
	
	

}
