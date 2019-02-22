package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {

	static WebDriver driver;
	
	@FindBy(id="first_name")
	WebElement first_name;
	
	@FindBy(id="last_name")
	WebElement last_name;
	
	@FindBy(name="address")
	WebElement billing_address;
	
	@FindBy(id="cc_num")
	WebElement card_num;
	
	@FindBy(id="cc_type")
	WebElement card_type;
	
	@FindBy(id="cc_exp_month")
	WebElement expiry_month;
	
	@FindBy(id="cc_exp_year")
	WebElement expiry_year;
	
	@FindBy(id="cc_cvv")
	WebElement cvv;
	
	@FindBy(id="book_now")
	WebElement book;
	
	@FindBy(id="hotel_name_dis")
	WebElement hotel_name;
	
	@FindBy(id="location_dis")
	WebElement location;
	
	@FindBy(id="room_type_dis")
	WebElement room_type;
	
	@FindBy(id="room_num_dis")
	WebElement room_num;
	
	@FindBy(id="price_night_dis")
	WebElement price_per_night;
	
	@FindBy(id="total_price_dis")
	WebElement total_price;
	
	@FindBy(name="final_price_dis")
	WebElement final_price;

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBilling_address() {
		return billing_address;
	}

	public WebElement getCard_num() {
		return card_num;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getHotel_name() {
		return hotel_name;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_num() {
		return room_num;
	}

	public WebElement getPrice_per_night() {
		return price_per_night;
	}

	public WebElement getTotal_price() {
		return total_price;
	}

	public WebElement getFinal_price() {
		return final_price;
	}
	
	public Book_hotel( WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
