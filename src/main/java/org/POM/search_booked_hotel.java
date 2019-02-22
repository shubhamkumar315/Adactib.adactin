package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_booked_hotel {

	static WebDriver driver;
	
	@FindBy(id="hotel_name_288466")
	WebElement hotel_name;
	
	@FindBy(id="location_288466")
	WebElement location;
	
	@FindBy(id="rooms_288466")
	WebElement room_number;
	
	@FindBy(id="no_days_288466")
	WebElement number_of_days;
	
	@FindBy(id="room_type_288466")
	WebElement room_type;
	
	@FindBy(id="price_night_288466")
	WebElement price;

	public WebElement getPrice() {
		return price;
	}

	public WebElement getHotel_name() {
		return hotel_name;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom_number() {
		return room_number;
	}

	public WebElement getNumber_of_days() {
		return number_of_days;
	}

	public WebElement getRoom_type() {
		return room_type;
	}
	
	public search_booked_hotel( WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(driver, this);
	}
}
