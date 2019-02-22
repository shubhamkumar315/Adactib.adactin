Feature: Test Hooks
 
@sce1
Scenario Outline: To verify valid login details
When User enter the username "<username>"
And user enters the password
And clicks on login button
Then User verifies the login was succesful"<username>"

Examples:
|username|
|ShubamKumar|
 
 @sce2
Scenario: To verify whether the check-out date field accepts a later date than check- in date.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters the checkin date
And User enters the checkout date
And User clicks on search button
Then User verifies if the check-out date field accepts a later date than check- in date

@sce3
Scenario: To check if error is reported if check-out date field is in the past
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a passed checkin date
And User enters a passed checkout date
And User clicks on search button
Then User verifies if error is reported if check-out date field is in the past

@sce4
Scenario Outline: To verify whether locations in Select Hotel page are displayed 
									according to the location selected in Search Hotel
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location "<city>"
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
Then User verifies if location in search hotel and select hotel are same "<city>"

Examples:
|city|
|Sydney|

@sce5
Scenario Outline: To verify whether Check-in date and Check Out date are being 
									displayed in Select Hotel page according to the dates selected 
									in search Hotel.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters the checkin date "<check-in date>"
And User enters the checkout date "<check-out date>"
And User clicks on search button
Then User selects hotel
Then User verifies check-in date and check-out date are same in search hotel and select hotel "<check-in date>","<check-out date>"

Examples:

|check-in date||check-out date|
|20/02/2019   ||23/02/2019    |

@sce6
Scenario Outline: To verify whether no. of rooms entry in Select Hotel page is 
									same as the Number of rooms selected in search hotel page
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User clicks on hotel type
And User selects number of roms "<room number>"
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
Then User verifies the number of rooms in select hote page and serch hotel page "<room number>"

Examples:

|room number|
|1				|

@sce7
Scenario Outline: To verify whether Room Type in Select Hotel page is same as 
									Room type selected in search hotel page
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type "<type>"
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
Then User verifies the room type is same in search hotel and select hotel "<type>"

Examples:

|type    |
|Standard|
 
 
@sce8
Scenario Outline: To verify whether the total price (excl.GST) is calculated as 
						“price per night * no. of nights* no of rooms”.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms "<room number>"
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
Then User verifies that total price(excl.GST) = price per night * no.of nights * no.of rooms "<room number>"

Examples:
|room number|
|1		      |

 @sce9
Scenario: To verify when pressed logout button logs out from the application.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
And User scrolls down to logout button
Then User clicks on Logout button
Then User verifies that user has logged out

#@sce10

@sce11
Scenario Outline: To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User verifies if hotel name is same in book hotel page and booking cinfirmation "<hotelname>"
Then User verifies if location is same in book hotel page and booking cinfirmation "<location>"
Then User verifies if room type is same in book hotel page and booking cinfirmation "<roomtype>"
Then User verifies if total days is same in book hotel page and booking cinfirmation "<total days>"
Then User verifies if price per night is same in book hotel page and booking cinfirmation "<price per night>"

Examples:

|hotelname ||location||roomtype||total days||price per night|
|Hotel Creek||Sydney  ||Standard||1 Room(s) ||AUD $ 125      |

#@sce12

#@sce13

@sce14
Scenario: Verify Order number is generated in booking confirmation page
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
And User scrolls to order number
Then verifies if order number is generated or not

@sce15
Scenario: To check whether the booked itinerary reflects the correct information in line with the booking.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User scrolls down to my itinerary
And click on my itinerary
Then verifies if iterations are editable or not

@sce16
Scenario Outline:To check whether the booked itinerary reflects the correct information in line with the booking.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User scrolls down to my itinerary
And click on my itinerary
Then User verifies if hotel name is same in book hotel page and iteration "<hotelname>"
Then User verifies if location is same in book hotel page and iteration "<location>"
Then User verifies if room type is same in book hotel page and iteration "<roomtype>"
Then User verifies if total days is same in book hotel page and iteration "<total days>"
Then User verifies if price per night is same in book hotel page and iteration "<price per night>"

Examples:

|hotelname  ||location||roomtype||total days||price per night|
|Hotel Creek||Sydney  ||Standard||2 Day(s)  ||AUD $ 125      |

@sce17
Scenario Outline: To check whether “search order id” query is working and displaying the relevant details.
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User scrolls down to my itinerary
And click on my itinerary
Then User clicks on search box
And User enters order id
And User clicks on search order button
Then User verifies if hotel name is same in book hotel page and search page "<hotelname>"
Then User verifies if location is same in book hotel page and search page "<location>"
Then User verifies if room type is same in book hotel page and search page "<roomtype>"
Then User verifies if total days is same in book hotel page and search page "<total days>"
Then User verifies if price per night is same in book hotel page search page "<price per night>"

Examples:

|hotelname  ||location||roomtype||total days||price per night|
|Hotel Creek||Sydney  ||Standard||2 Day(s)  ||AUD $ 125      |

#@sce18
Scenario Outline: To verify that the order gets cancelled after click on Cancel order number link
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User saves the generated id and clicks on iterary button then send value to search box
And User clicks on search order button
Then User verifies if hotel name is same in book hotel page and search page "<hotelname>"
Then User verifies if location is same in book hotel page and search page "<location>"
Then User verifies if room type is same in book hotel page and search page "<roomtype>"
Then User verifies if total days is same in book hotel page and search page "<total days>"
Then User verifies if price per night is same in book hotel page search page "<price per night>"

Examples:

|hotelname  ||location||roomtype||total days||price per night|
|Hotel Creek||Sydney  ||Standard||2 Day(s)  ||AUD $ 125      |

@sce19
Scenario: To verify that the order gets cancelled after click on Cancel order number link
When User enter the username 
And user enters the password
And clicks on login button
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User selects hotel
And User clicks on continue
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User scrolls down to my itinerary
And click on my itinerary
And clicks in cancel button
And User accepts the alert

@sce20
Scenario: To Verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”
When User enter the username 
And user enters the password
And clicks on login button
Then User verifies the search hotel title
Then User selects location
And User selects the hotel
And User selecys room type
And User selects number of roms
And User enters a correct checkin date
And User enters a correct checkout date
And User clicks on search button
Then User verifies select hotel title
Then User selects hotel
And User clicks on continue
Then User verifies book hotel title
Then User enters first name
And User enters last name
And User enters billing adress
And User eners card number
And user selects card type
And Users selects expiry month
And User enters expiry year
And User enters cvvs
Then User clicks on book now 
Then User verifies confirmation title

