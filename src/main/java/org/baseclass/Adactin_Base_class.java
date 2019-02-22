package org.baseclass;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adactin_Base_class {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(String browserName) {
		
		try {
			if(browserName=="chrome") {
				System.setProperty("webdriver.chrome.driver", "/Users/rajeevranjan/eclipse-workspace/Selanium/Driver/chromedriver");
				driver=new ChromeDriver();
				
			}else if(browserName=="firefox"){
				System.setProperty("webdriver.gecko.driver", "/Users/rajeevranjan/eclipse-workspace/Selanium/Driver/geckodriver");
				driver=new FirefoxDriver();
				
			}else if(browserName=="safari") {
				System.setProperty("webdriver.safari.driver", "/Users/rajeevranjan/eclipse-workspace/Selanium/Driver/SafariDriver.safariextz");
			    driver=new SafariDriver();
				
			}else {
				System.out.println("Enter valid browsername");
				throw new RuntimeException("Enter valid browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Enter valid browsername");

		}
	return driver;
		
	}
	
	
//url
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	
//visibility	
	public static void waitForVisibiltyofElement(WebElement element) {
		WebDriverWait wb = new WebDriverWait(driver,50);
		wb.until(ExpectedConditions.visibilityOf(element));
	}
	public static Boolean elementIsDisplayed(WebElement element) {
		boolean displayed=element.isDisplayed();
		return displayed;
	}
	public static Boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	
//send key
	
	public static void send_Key(WebElement element, String value) throws Exception {
		try {
			waitForVisibiltyofElement(element);
			if(elementIsDisplayed(element)&&elementIsEnabled(element)) {
				element.clear();
				element.sendKeys(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(); 
		}
	}
	
	
//get text	
	public static String get_text(WebElement element)throws Exception {
		
		String text=null;
		 try {
			text=element.getText();
			System.out.println(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("null");
		}
		return text;
				
			
}
	
//get Attribute
	
	public static String getAttribute(WebElement element, String value) {
		String attribute=null;

		try {
			attribute=element.getAttribute(value);
			System.out.println(attribute);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return attribute;
		
	}
	

//click	
	public static void click_on_Element(WebElement element)throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}
	
	
//right click
	public static void right_Click(WebElement element) throws Exception {
			try {
				waitForVisibiltyofElement(element);
				Actions m=new Actions(driver);
				m.contextClick(element).build().perform();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();
			}
			
	}
	
	
//double click
	public static void double_Click (WebElement element) throws Exception{
		
		try {
			waitForVisibiltyofElement(element);
			Actions n =new Actions(driver);
			n.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
		
		}
	
	
//mouse move over
	 public static void mouse_Mover(WebElement element) throws Exception {
		
		try {
			waitForVisibiltyofElement(element);
			Actions ac= new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	 }
	 
	 
//screenshot 
	 	public static void screenshot_of_appk(String filename) throws Exception{
		 
		 try {
			 TakesScreenshot y = (TakesScreenshot) driver;
				File Screenshot=y.getScreenshotAs(OutputType.FILE);
				File saveFile = new File("/Users/rajeevranjan/eclipse-workspace/CucumberDemo/"+ filename+".png");
				FileUtils.copyFile(Screenshot, saveFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
		 
		 }
	 	
	 	
//drag drop	 	
	  public static void drag_and_drop(WebElement element, WebElement element1 ) throws Exception{
		 
		 try {
			 Actions ac= new Actions(driver);
				ac.dragAndDrop(element, element1).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	 
	 }
	 
	 
//select from drop down box
	 public static void select_FromDD(WebElement element,String Options, String Value)throws Exception {
		
		
			try {
				Select sc = new Select(element);
				
				if(Options.equalsIgnoreCase("Value")) {
					sc.selectByValue(Value);
				}else if(Options.equalsIgnoreCase("VisibleText")){
					sc.selectByVisibleText(Value);
				}else if(Options.equalsIgnoreCase("Index")) {
					sc.selectByIndex(Integer.parseInt(Value));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("unable to select");

			}
		}
	 
//show all options from DD
		 public static void show_All_Options_FromDD(WebElement element)throws Exception{
			 
			 try {
				Select m= new Select(element);
				 List<WebElement> selected = m.getOptions();
					for(WebElement x:selected) {
						System.out.println(x.getText());
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("unable to print");
			}
		 }

		 
//show selected option from DD
		 public static String show_Selected_Option_FromDD(WebElement element) throws Exception{
			 String text=null;
			 try {
				Select m= new Select(element);
				 List<WebElement> selected = m.getAllSelectedOptions();
					for(WebElement x:selected) {
						System.out.println(x.getText());
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("unable to print");
			}
			return text;
			
				
		 }
	 
	 
	 
//alert	 
	 public static void wait_for_AlertBox() throws Exception{
		 
		 try {
			WebDriverWait w= new WebDriverWait(driver, 30);
			 w.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("AlertBox not present");
		}
	 }
	 
	 public static void accept_Alert() throws Exception{
		 
		 try {
			 Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			 a.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("unable to accept");
		}
	 }
	 
	 public static void dismiss_Alert() throws Exception{
		 
		 try {
			 Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			 a.dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("unable to dismiss");
		}
	 }
	 	 
	 public static void send_Text_toAlert(String text) throws Exception{
		 
			try {
				Alert a = driver.switchTo().alert();
				 a.sendKeys(text);
				 Thread.sleep(3000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("unable to enter text");
			}
		
	 }
	 
	 
//switch to frame
	 public static void switch_To_iframe(WebElement element) throws Exception{
		 
		 try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("unable to switch to frame");
		}
	 }
	 
	 

//navigate	 
	 public static void navigate(String option) throws Exception{
		 
		 try {
			if(option.equalsIgnoreCase("back")) {
				 driver.navigate().back();
			 }else if(option.equalsIgnoreCase("forward")){
				 driver.navigate().forward();
			 }else if(option.equalsIgnoreCase("refresh")) {
				 driver.navigate().refresh();
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("invalid navigation command");
		}
	 }
	 
	 
//print current url
	 public static void print_current_url() throws Exception{
		 
		 try {
			String x=driver.getCurrentUrl();
			 System.out.println(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("unable tp print url");
		}
	 }
	 
	 
//print title of web application
	 public static void get_title_of_appk() throws Exception{
		 
		 try {
			String x= driver.getTitle();
				System.out.println(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("unable tp print title");
		}
	 }
	 
	 
//scroll
		 public static void scroll_up_down(WebElement element) throws Exception{
			 
				try {
					JavascriptExecutor js= (JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView();",element);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception("unable to scroll");
				}
				
		 }
					
		 
//window handeling
	 public static void window_handle(WebElement element) throws Exception{
		 
		 try {
			String cid=driver.getWindowHandle();
			 System.out.println(cid);
			 waitForVisibiltyofElement(element);
			 Set<String> pid = driver.getWindowHandles();
			 System.out.println(pid);
			 
			 for (String x : pid) {
				 if (!x.equals(cid)) {
					 driver.switchTo().window(x);
					}
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 }
	 
	 
	 
	 
	 
	 
	 
		 
	 }
	 
	 
	 
	 
	
	
	
	
	
		
