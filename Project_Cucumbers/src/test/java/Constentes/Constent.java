package Constentes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Cart_Page;
import Page_Object.DashBoard_Page;
import Page_Object.Product_Page;
import Page_Object.Registration_page;

public class Constent {

    protected static WebDriver driver;
    
    protected Registration_page reg = new Registration_page(driver);
    
    protected  Product_Page product = new Product_Page(driver);
    
	  protected   Cart_Page cart = new Cart_Page(driver);
	  
	  protected  DashBoard_Page dash = new DashBoard_Page(driver);
    
	public static WebDriverWait wait ;
	
	public static String system = "webdriver.chrome.driver";
	
	public static String Browser_Path ;
	
	public static String Browser_Name;
	
	public static String Url ;
	
	public static String FirstName;
	
	public static String LastName;
	
	public static String Email;
	
	public static String Password;
	
	public static  String ProfileName;
	
	public static String MensCategory;
	
	public static String MensProductName;
	
	public static String WomwnsCategory;
	
	public static String WomenProduct;
	
	public static String MenProductMaxprice;
	
	public static String MensProductSize;
	
	public static String Quantity;
	
	public static String WomensproductMaxprice;
	
	public static String Searchproduct;
	
	public static String SearchproductName;
	
	public static String ShoeSize;
	
	public static String CollectionCategory;
	
	public static String CollectionProductname;
	
}
