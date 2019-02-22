package org.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logout {
	
	static WebElement driver;
	
	@FindBy(xpath="(//td[@valign=\"top\"])[1]/table/tbody/tr/td/a")
	WebElement logout_verify;

}
