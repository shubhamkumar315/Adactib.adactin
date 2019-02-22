package com.Adactin.stepdefinition;

import org.POM.Book_hotel;
import org.POM.Search_hotel;
import org.POM.Select_hotel;
import org.POM.confirmation;
import org.POM.iterary;
import org.POM.login;
import org.POM.search_booked_hotel;
import org.POM.titles;
import org.baseclass.Adactin_Base_class;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition extends Adactin_Base_class {
	private static final CharSequence Search = null;

	@Before
	public static void setup(){
		getDriver("chrome");
		getUrl("https://adactin.com/HotelAppBuild2/");
		}
	
	@After
	public static void afterscenario() throws Exception {
		Thread.sleep(3000);
	    driver.quit();
	}
//sce1	
	@When("^User enter the username \"([^\"]*)\"$")
	public void user_enter_the_username(String arg1) throws Throwable {
	    login x=new login(driver);
	    send_Key(x.getUsername(), arg1);
	}
	
	@When("^user enters the password$")
	public void user_enters_the_password() throws Throwable {
		login x=new login(driver);
		send_Key(x.getPassword(), "8651839890");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		login x=new login(driver);
		click_on_Element(x.getLogin());
	}

	@Then("^User verifies the login was succesful\"([^\"]*)\"$")
	public void user_verifies_the_login_was_succesful(String arg1) throws Throwable {
	    Search_hotel x=new Search_hotel(driver);
	    if (getAttribute(x.getWelcome_verification(), "value").contains(arg1)) {
	    	System.out.println("user is "+ arg1);
			}else {
			throw new Exception();
		}
	}
//sce2	
	@When("^User enter the username$")
	public void user_enter_the_username() throws Throwable {
	    login x=new login(driver);
	    send_Key(x.getUsername(), "ShubamKumar");
	}




	@Then("^User selects location$")
	public void user_selects_location() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		select_FromDD(x.getCity(), "value", "Sydney");
	   
	}

	@Then("^User selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		select_FromDD(x.getHotel(), "value", "Hotel Creek");
	}

	@Then("^User selecys room type$")
	public void user_selecys_room_type() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		select_FromDD(x.getRoomtype(), "value", "Standard");
	}

	@Then("^User selects number of roms$")
	public void user_selects_number_of_roms() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		select_FromDD(x.getRoom_num(), "value", "1");
	}

	@Then("^User enters the checkin date$")
	public void user_enters_the_checkin_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		send_Key(x.getChechin_date(), "22/02/2019");
	}

	@Then("^User enters the checkout date$")
	public void user_enters_the_checkout_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		send_Key(x.getCheckout_date(), "20/02/2019");
	}

	@Then("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		click_on_Element(x.getSubmit());
	}

	@Then("^User verifies if the check-out date field accepts a later date than check- in date$")
	public void user_verifies_if_the_check_out_date_field_accepts_a_later_date_than_check_in_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		org.junit.Assert.assertEquals("Check-Out Date shall be after than Check-In Date", get_text(x.getCheckout_error()));	
	}
//sce3	
	@Then("^User enters a passed checkin date$")
	public void user_enters_a_passed_checkin_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		send_Key(x.getChechin_date(), "11/02/2019");
	}

	@Then("^User enters a passed checkout date$")
	public void user_enters_a_passed_checkout_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		send_Key(x.getCheckout_date(), "13/02/2019");
	}

	@Then("^User verifies if error is reported if check-out date field is in the past$")
	public void user_verifies_if_error_is_reported_if_check_out_date_field_is_in_the_past() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		org.junit.Assert.assertEquals("Check-In Date should be either Today or Later Date",get_text(x.getCheckin_error()));	
}
//sce4
	
	@Then("^User enters a correct checkin date$")
	public void user_enters_a_correct_checkin_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		send_Key(x.getChechin_date(), "22/02/2019");
	    
	}

	@Then("^User enters a correct checkout date$")
	public void user_enters_a_correct_checkout_date() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		send_Key(x.getCheckout_date(), "24/02/2019");
	    
	}
	
	@Then("^User selects hotel$")
	public void user_selects_hotel() throws Throwable {
	   Select_hotel x=new Select_hotel(driver);
	   click_on_Element(x.getSelect_hotel());
	}
	
	@Then("^User selects location \"([^\"]*)\"$")
	public void user_selects_location(String arg1) throws Throwable {
	   Search_hotel x=new Search_hotel(driver);
	   select_FromDD(x.getCity(), "value", arg1);
	}

	@Then("^User verifies if location in search hotel and select hotel are same \"([^\"]*)\"$")
	public void user_verifies_if_location_in_search_hotel_and_select_hotel_are_same(String arg1) throws Throwable {
		
	    Select_hotel x=new Select_hotel(driver);
	    org.junit.Assert.assertEquals(arg1 , getAttribute(x.getLocation_verification(), "value"));
	  }
//sce5	
	@Then("^User enters the checkin date \"([^\"]*)\"$")
	public void user_enters_the_checkin_date(String arg1) throws Throwable {
	    Search_hotel x=new Search_hotel(driver);
	    send_Key(x.getChechin_date(), arg1);
	}

	@Then("^User enters the checkout date \"([^\"]*)\"$")
	public void user_enters_the_checkout_date(String arg1) throws Throwable {
		Search_hotel x=new Search_hotel(driver);
	    send_Key(x.getCheckout_date(), arg1);
	    
	}

	@Then("^User verifies check-in date and check-out date are same in search hotel and select hotel \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_verifies_check_in_date_and_check_out_date_are_same_in_search_hotel_and_select_hotel(String arg1, String arg2) throws Throwable {
	    Select_hotel x=new Select_hotel(driver);
	    org.junit.Assert.assertEquals(arg1, getAttribute(x.getCheckin_verify(), "value"));
	    org.junit.Assert.assertEquals(arg2, getAttribute(x.getCheckout_verify(), "value"));
	}
//sce6	
	@Then("^User clicks on hotel type$")
	public void user_clicks_on_hotel_type() throws Throwable {
		Search_hotel x=new Search_hotel(driver);
		click_on_Element(x.getRoom_num());
	}

	@Then("^User selects number of roms \"([^\"]*)\"$")
	public void user_selects_number_of_roms(String arg1) throws Throwable {
	    Search_hotel x=new Search_hotel(driver);
	    select_FromDD(x.getRoom_num(), "value", arg1);
	}

	@Then("^User verifies the number of rooms in select hote page and serch hotel page \"([^\"]*)\"$")
	public void user_verifies_the_number_of_rooms_in_select_hote_page_and_serch_hotel_page(String arg1) throws Throwable {
	   Select_hotel x=new Select_hotel(driver);
	  if (getAttribute(x.getRoom_num_verify(), "value").contains(arg1)) {
		System.out.println("number of rooms = "+ arg1);
	}else {
		throw new Exception();
	}
	}
//sce7
	@Then("^User selecys room type \"([^\"]*)\"$")
	public void user_selecys_room_type(String arg1) throws Throwable {
	    Search_hotel x=new Search_hotel(driver);
	    click_on_Element(x.getRoomtype());
	    select_FromDD(x.getRoomtype(), "value", arg1);
	}

	@Then("^User verifies the room type is same in search hotel and select hotel \"([^\"]*)\"$")
	public void user_verifies_the_room_type_is_same_in_search_hotel_and_select_hotel(String arg1) throws Throwable {
	   Select_hotel x=new Select_hotel(driver);
	   String a=getAttribute(x.getRoom_type_verify(), "value");
	   if (a.contains(arg1)) {
		System.out.println("room type match");
	}else {
		throw new Exception();
	}
	}


//sce8
	@Then("^User verifies that total price\\(excl\\.GST\\) = price per night \\* no\\.of nights \\* no\\.of rooms \"([^\"]*)\"$")
	public void user_verifies_that_total_price_excl_GST_price_per_night_no_of_nights_no_of_rooms(String arg1) throws Throwable {
Select_hotel x=new Select_hotel(driver);
	 
	    int parseInt = Integer.parseInt(arg1);
	    String a=getAttribute(x.getPrice_per_night(), "value");
	    String trim = a.substring(5).trim();
	    int parseInt2 = Integer.parseInt(trim);
	    String b = getAttribute(x.getNum_of_days(), "value");
	    String trim2 = b.substring(0, 1).trim();
	    int parseInt3 = Integer.parseInt(trim2);
	    int v=(parseInt*parseInt2*parseInt3);
	    String w = Integer.toString(v);
	    String k = getAttribute(x.getTptal_price(), "value");
	    
	    if (k.contains(w)) {
	    	System.out.println("price match");
		}else {
			throw new Exception();
		}
	    
	}
	

//sce9
	@Then("^User clicks on continue$")
	public void user_clicks_on_continue() throws Throwable {
	    Select_hotel x=new Select_hotel(driver);
	    click_on_Element(x.getContinue_booking());
	}
	
	@Then("^User enters first name$")
	public void user_enters_first_name() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    send_Key(x.getFirst_name(), "shubham");
	}

	@Then("^User enters last name$")
	public void user_enters_last_name() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    send_Key(x.getLast_name(), "kumar");
	}

	@Then("^User enters billing adress$")
	public void user_enters_billing_adress() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    send_Key(x.getBilling_address(), "greens technelogy, anna nagar east");
	}

	@Then("^User eners card number$")
	public void user_eners_card_number() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    send_Key(x.getCard_num(), "1234123412341234");
	}

	@Then("^user selects card type$")
	public void user_selects_card_type() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    select_FromDD(x.getCard_type(), "value", "MAST");
	}

	@Then("^Users selects expiry month$")
	public void users_selects_expiry_month() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
		select_FromDD(x.getExpiry_month(),"value","6");
	    
	}

	@Then("^User enters expiry year$")
	public void user_enters_expiry_year() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    select_FromDD(x.getExpiry_year(), "value","2021");
	}

	@Then("^User enters cvvs$")
	public void user_enters_cvvs() throws Throwable {
		Book_hotel x=new Book_hotel(driver);
	    send_Key(x.getCvv(), "123");
	}

	@Then("^User clicks on book now$")
	public void user_clicks_on_book_now() throws Throwable {
	    Book_hotel x=new Book_hotel(driver);
	    click_on_Element(x.getBook());
	    Thread.sleep(5000);
	}
	
	@Then("^User scrolls down to logout button$")
	public void user_scrolls_down_to_logout_button() throws Throwable {
		confirmation x=new  confirmation(driver);
		scroll_up_down(x.getLogout());
	}



	@Then("^User clicks on Logout button$")
	public void user_clicks_on_Logout_button() throws Throwable {
	    confirmation x=new  confirmation(driver);
	    click_on_Element(x.getLogout());
	    
	}

	@Then("^User verifies that user has logged out$")
	public void user_verifies_that_user_has_logged_out() throws Throwable {
		confirmation x=new confirmation(driver);
		
		String a=get_text(x.getLogout_verify());
		if (a.contains("login")) {
			System.out.println("User have been logged out");
		}else {
			throw new Exception();
		}
		}
	

//sce11	
	@Then("^User verifies if hotel name is same in book hotel page and booking cinfirmation \"([^\"]*)\"$")
	public void user_verifies_if_hotel_name_is_same_in_book_hotel_page_and_booking_cinfirmation(String arg1) throws Throwable {
	    confirmation x=new confirmation(driver);
	    String a= getAttribute(x.getHotel_name(), "value");
	   if (a.contains(arg1)) {
			System.out.println("hotel name is same as entered");
		}else {
			throw new Exception("not possble");
		}
	}

	@Then("^User verifies if location is same in book hotel page and booking cinfirmation \"([^\"]*)\"$")
	public void user_verifies_if_location_is_same_in_book_hotel_page_and_booking_cinfirmation(String arg1) throws Throwable {
		confirmation x=new confirmation(driver);
	    String a= getAttribute(x.getLocation(), "value");
	   if (a.contains(arg1)) {
			System.out.println("location is same as entered");
		}else {
			throw new Exception("not possble");
		}
	}

	@Then("^User verifies if room type is same in book hotel page and booking cinfirmation \"([^\"]*)\"$")
	public void user_verifies_if_room_type_is_same_in_book_hotel_page_and_booking_cinfirmation(String arg1) throws Throwable {
		confirmation x=new confirmation(driver);
	    String a= getAttribute(x.getRoom_type(), "value");
	   if (a.contains(arg1)) {
			System.out.println("room type is same as entered");
		}else {
			throw new Exception("not possble");
		}
	}

	@Then("^User verifies if total days is same in book hotel page and booking cinfirmation \"([^\"]*)\"$")
	public void user_verifies_if_total_days_is_same_in_book_hotel_page_and_booking_cinfirmation(String arg1) throws Throwable {
		confirmation x=new confirmation(driver);
	    String a= getAttribute(x.getNum_of_room(), "value");
	   if (a.contains(arg1)) {
			System.out.println("room type is same as entered");
		}else {
			throw new Exception("not possble");
		}
	}

	@Then("^User verifies if price per night is same in book hotel page and booking cinfirmation \"([^\"]*)\"$")
	public void user_verifies_if_price_per_night_is_same_in_book_hotel_page_and_booking_cinfirmation(String arg1) throws Throwable {
		confirmation x=new confirmation(driver);
	    String a= getAttribute(x.getPrice_per_night(), "value");
	   if (a.contains(arg1)) {
			System.out.println("room type is same as entered");
		}else {
			throw new Exception("not possble");
		}
	}
	
//sce14
	
	@Then("^User scrolls to order number$")
	public void user_scrolls_to_order_number() throws Throwable {
	    confirmation x=new confirmation(driver);
	    scroll_up_down(x.getOrder_num());
	}

	@Then("^verifies if order number is generated or not$")
	public void verifies_if_order_number_is_generated_or_not() throws Throwable {
	    confirmation x=new confirmation(driver);
	    	String a=getAttribute(x.getOrder_num(), "value");
	    	if (a.isEmpty()) {
				System.out.println("order id not generated");
			}else {
				System.out.println("order id is:"+ a);
			}
	}

//sce15
	
	@Then("^User scrolls down to my itinerary$")
	public void user_scrolls_down_to_my_itinerary() throws Throwable {
	    confirmation x=new confirmation(driver);
	    scroll_up_down(x.getIteration());
	}

	@Then("^click on my itinerary$")
	public void click_on_my_itinerary() throws Throwable {
		confirmation x=new confirmation(driver);
		click_on_Element(x.getIteration());
	}
	
	@Then("^verifies if iterations are editable or not$")
	public void verifies_if_iterations_are_editable_or_not() throws Throwable {
		iterary x=new iterary(driver);
		if (x.getHotel_name().isEnabled()) {
			System.out.println("Values can be edited");
		}else {
			throw new Exception();
		}
	    
	}

//sce16
	
	@Then("^User verifies if hotel name is same in book hotel page and iteration \"([^\"]*)\"$")
	public void user_verifies_if_hotel_name_is_same_in_book_hotel_page_and_iteration(String arg1) throws Throwable {
	    iterary x=new iterary(driver);
	    String a=getAttribute(x.getHotel_name(), "value");
	    System.out.println(a);
	    		if (a.contains(arg1)) {
					System.out.println("hotel name are same");
				}else {
					throw new Exception();
				}
	}

	@Then("^User verifies if location is same in book hotel page and iteration \"([^\"]*)\"$")
	public void user_verifies_if_location_is_same_in_book_hotel_page_and_iteration(String arg1) throws Throwable {
		iterary x=new iterary(driver);
		String a=getAttribute(x.getLocation(), "value");
		if (a.contains(arg1)) {
			System.out.println("location are same");
		}else {
			throw new Exception();
		}

	}

	@Then("^User verifies if room type is same in book hotel page and iteration \"([^\"]*)\"$")
	public void user_verifies_if_room_type_is_same_in_book_hotel_page_and_iteration(String arg1) throws Throwable {
		iterary x=new iterary(driver);
		String a=getAttribute(x.getRoomtype(), "value");
		if (a.contains(arg1)) {
			System.out.println("room type are same");
		}else {
			throw new Exception();
		}

	}

	@Then("^User verifies if total days is same in book hotel page and iteration \"([^\"]*)\"$")
	public void user_verifies_if_total_days_is_same_in_book_hotel_page_and_iteration(String arg1) throws Throwable {
		iterary x=new iterary(driver);
		String a=getAttribute(x.getDays(), "value");
		if (a.contains(arg1)) {
			System.out.println("total number of days are same");
		}else {
			throw new Exception();
		}

	}

	@Then("^User verifies if price per night is same in book hotel page and iteration \"([^\"]*)\"$")
	public void user_verifies_if_price_per_night_is_same_in_book_hotel_page_and_iteration(String arg1) throws Throwable {
		iterary x=new iterary(driver);
		String a=getAttribute(x.getPrice(), "value");
		if (a.contains(arg1)) {
			System.out.println("price are same");
		}else {
			throw new Exception();
		}

	}

//sce17
	
	@Then("^User clicks on search box$")
	public void user_clicks_on_search_box() throws Throwable {
		iterary x=new iterary(driver);
		click_on_Element(x.getSearch_box());
	}

	@Then("^User enters order id$")
	public void user_enters_order_id() throws Throwable {
		iterary x=new iterary(driver);
		send_Key(x.getSearch_box(), "85R2U95HO2");
	}

	@Then("^User clicks on search order button$")
	public void user_clicks_on_search_order_button() throws Throwable {
		iterary x=new iterary(driver);
		click_on_Element(x.getSearch_button());
	}
	
	@Then("^User verifies if hotel name is same in book hotel page and search page \"([^\"]*)\"$")
	public void user_verifies_if_hotel_name_is_same_in_book_hotel_page_and_search_page(String arg1) throws Throwable {
	   search_booked_hotel x=new search_booked_hotel(driver);
	   String a=getAttribute(x.getHotel_name(), "value");
		if (a.contains(arg1)) {
			System.out.println("price are same");
		}else {
			throw new Exception();
		}
	}

	@Then("^User verifies if location is same in book hotel page and search page \"([^\"]*)\"$")
	public void user_verifies_if_location_is_same_in_book_hotel_page_and_search_page(String arg1) throws Throwable {
		 search_booked_hotel x=new search_booked_hotel(driver);
		 String a=getAttribute(x.getLocation(), "value");
			if (a.contains(arg1)) {
				System.out.println("price are same");
			}else {
				throw new Exception();
			}
	}

	@Then("^User verifies if room type is same in book hotel page and search page \"([^\"]*)\"$")
	public void user_verifies_if_room_type_is_same_in_book_hotel_page_and_search_page(String arg1) throws Throwable {
		 search_booked_hotel x=new search_booked_hotel(driver);
		 String a=getAttribute(x.getRoom_type(), "value");
			if (a.contains(arg1)) {
				System.out.println("price are same");
			}else {
				throw new Exception();
			}
	}

	@Then("^User verifies if total days is same in book hotel page and search page \"([^\"]*)\"$")
	public void user_verifies_if_total_days_is_same_in_book_hotel_page_and_search_page(String arg1) throws Throwable {
		 search_booked_hotel x=new search_booked_hotel(driver);
		 String a=getAttribute(x.getNumber_of_days(), "value");
			if (a.contains(arg1)) {
				System.out.println("price are same");
			}else {
				throw new Exception();
			}
	}

	@Then("^User verifies if price per night is same in book hotel page search page \"([^\"]*)\"$")
	public void user_verifies_if_price_per_night_is_same_in_book_hotel_page_search_page(String arg1) throws Throwable {
		 search_booked_hotel x=new search_booked_hotel(driver);
		 String a=getAttribute(x.getPrice(), "value");
			if (a.contains(arg1)) {
				System.out.println("price are same");
			}else {
				throw new Exception();
			}
	}

//sce18
	
	@Then("^User saves the generated id and clicks on iterary button then send value to search box$")
	public void user_saves_the_generated_id_and_clicks_on_iterary_button_then_send_value_to_search_box() throws Throwable {
	    confirmation x=new confirmation(driver);
	    iterary y=new iterary(driver);
	    search_booked_hotel z=new search_booked_hotel(driver);
	    
	   String att = getAttribute(x.getOrder_num(), "value");
	   click_on_Element(x.getIteration());
	   click_on_Element(y.getSearch_box());
	   send_Key(y.getSearch_box(),att);
	   
	}
	
//sce19
	
	@Then("^clicks in cancel button$")
	public void clicks_in_cancel_button() throws Throwable {
		iterary x=new iterary(driver);
	    click_on_Element(x.getCancel_button());
	}


	    


	@Then("^User accepts the alert$")
	public void user_accepts_the_alert() throws Throwable {
	    
		accept_Alert();
	}

//sce20
	
	@Then("^User verifies the search hotel title$")
	public void user_verifies_the_search_hotel_title() throws Throwable {
	   titles x=new titles(driver);
	   String a = get_text(x.getSearch_hotel_title());
	   if (a.contains("Search Hotel")) {
		System.out.println("Search Hotel");
	}else {
		throw new Exception();
	}
	}

	@Then("^User verifies select hotel title$")
	public void user_verifies_select_hotel_title() throws Throwable {
		titles x=new titles(driver);
		   String a = get_text(x.getSelect_hotel_title());
		   if (a.contains("Select Hotel")) {
			System.out.println("Select Hotel ");
		}else {
			throw new Exception();
		}
		
	}

	@Then("^User verifies book hotel title$")
	public void user_verifies_book_hotel_title() throws Throwable {
		titles x=new titles(driver);
		   String a = get_text(x.getBook_a_hotel_title());
		   if (a.contains("Book A Hotel")) {
			System.out.println("Book A Hotel ");
		}else {
			throw new Exception();
		}
		
	}

	@Then("^User verifies confirmation title$")
	public void user_verifies_confirmation_title() throws Throwable {
		titles x=new titles(driver);
		   String a = get_text(x.getBooking_confirmation_title());
		   if (a.contains("Booking Confirmation")) {
			System.out.println("Booking Confirmation ");
		}else {
			throw new Exception();
		}
		
		   System.out.println("All the titles match");
	}


	
}