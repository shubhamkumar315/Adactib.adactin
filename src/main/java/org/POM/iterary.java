package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iterary {

	static WebDriver driver;
	
	@FindBy(name="ids[]")
	WebElement checkbox;
	
	@FindBy(id="hotel_name_288460")
	WebElement hotel_name;
	
	@FindBy(id="btn_id_288460")
	WebElement cancel;
	
	@FindBy(id="order_id_288460")
	WebElement order_id;
	
	@FindBy(id="location_288460")
	WebElement location;
	
	@FindBy(id="room_type_288460")
	WebElement roomtype;
	
	@FindBy(id="no_days_288460")
	WebElement days;
	
	@FindBy(id="price_night_288460")
	WebElement price;
	
	@FindBy(id="order_id_text")
	WebElement search_box;
	
	@FindBy(id="search_hotel_id")
	WebElement search_button;
	
	@FindBy(id="btn_id_288502")
	WebElement cancel_button;
	
	
	public WebElement getCancel_button() {
		return cancel_button;
	}



	public WebElement getSearch_box() {
		return search_box;
	}

	

	public WebElement getSearch_button() {
		return search_button;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getHotel_name() {
		return hotel_name;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getOrder_id() {
		return order_id;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getPrice() {
		return price;
	}

	public iterary( WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(driver, this);
	}

	}

