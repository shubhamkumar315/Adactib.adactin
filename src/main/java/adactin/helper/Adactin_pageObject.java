package adactin.helper;

import org.POM.Book_hotel;
import org.POM.Search_hotel;
import org.POM.Select_hotel;
import org.POM.confirmation;
import org.POM.iterary;
import org.POM.login;
import org.POM.logout;
import org.POM.search_booked_hotel;
import org.POM.titles;
import org.openqa.selenium.WebDriver;


public class Adactin_pageObject {
	
	private WebDriver driver;
	private login A;
	private Search_hotel B;
	private Select_hotel C;
	private Book_hotel D;
	private confirmation E;
	private logout F;
	private iterary G;
	private search_booked_hotel H;
	private titles I;
	
	
	public login getA() {
		return (A==null)? A= new login(driver) : A;
		}
	
	public Search_hotel getB() {
		return (B==null)? B= new Search_hotel(driver) : B;
		}
	
	public Select_hotel getC() {
		return (C==null)? C= new Select_hotel(driver) : C;
		}
	
	public Book_hotel getD() {
		return (D==null)? D= new Book_hotel(driver) : D;
		}
	
	public confirmation getE() {
		return (E==null)? E= new confirmation(driver) : E;
		}
	
	public logout getF() {
		return (F==null)? F= new logout() : F;
		}
	
	public iterary getG() {
		return (G==null)? G= new iterary(driver) : G;
		}
	
	public search_booked_hotel getH() {
		return (H==null)? H= new search_booked_hotel(driver) : H;
		}
	
	public titles getI() {
		return (I==null)? I= new titles(driver) : I;
		}
	
	public Adactin_pageObject(WebDriver ldriver) {
		this.driver = ldriver;
	}

}
