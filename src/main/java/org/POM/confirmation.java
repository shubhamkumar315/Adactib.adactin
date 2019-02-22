package org.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmation {
	
	static WebDriver driver;
	
	@FindBy(id="search_hotel")
	WebElement back_to_search_hotel;
	
	@FindBy(id="my_itinerary")
	WebElement iteration;
	
	@FindBy(id="logout")
	WebElement logout;
	
	@FindBy(id="hotel_name")
	WebElement hotel_name;
	
	@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="room_type")
	WebElement room_type;
	
	@FindBy(id="total_rooms")
	WebElement num_of_room;
	
	@FindBy(id="first_name")
	WebElement first_name;
	
	@FindBy(id="last_name")
	WebElement last_name;
	
	@FindBy(id="arrival_date")
	WebElement arrival_date;
	
	@FindBy(id="departure_text")
	WebElement departure_date;
	
	
	
	@FindBy(id="price_night")
	WebElement price_per_night;
	
	@FindBy(id="total_price")
	WebElement total_price;
	
	@FindBy(id="total_price")
	WebElement final_price;
	
	@FindBy(id="order_no")
	WebElement order_num;
	
	@FindBy(xpath="//a[@href='index.php']")
	WebElement logout_verify;

	public WebElement getLogout_verify() {
		return logout_verify;
	}

	public WebElement getBack_to_search_hotel() {
		return back_to_search_hotel;
	}

	public WebElement getIteration() {
		return iteration;
	}

	public WebElement getLogout() {
		return logout;
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

	public WebElement getNum_of_room() {
		return num_of_room;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getArrival_date() {
		return arrival_date;
	}

	public WebElement getDeparture_date() {
		return departure_date;
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

	public WebElement getOrder_num() {
		return order_num;
	}
	
	public confirmation( WebDriver Idriver) {
		driver=Idriver;
		PageFactory.initElements(driver, this);
	}
}
