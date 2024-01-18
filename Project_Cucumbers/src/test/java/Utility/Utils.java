package Utility;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constentes.Constent;
import Page_Object.Cart_Page;
import Page_Object.Product_Page;

public class Utils extends Constent {
	
	  protected static JavascriptExecutor jse ;
	
	  public static Logger log = (Logger) LogManager.getLogger(Utils.class);
	  
       
	public static void ReadProperties() throws IOException {
		
		
		     log.info("Read The Properties File ");
		     
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Project_Cucumbers\\src\\test\\resources\\PropertiesFile\\Config.properties");
			
			Properties pro = new Properties();
			
			pro.load(file);
			
			log.info("Get The Data Form Properties File ");
			
			Constent.Url=  pro.getProperty("url");
			Constent.Browser_Name = pro.getProperty("browser");
			Constent.Browser_Path=   pro.getProperty("browserPath");
			Constent.FirstName=  pro.getProperty("firstname");
			Constent.LastName=  pro.getProperty("lastname");
			Constent.Email=  pro.getProperty("email");
			Constent.Password=  pro.getProperty("password");
			Constent.ProfileName=pro.getProperty("profilename");
			Constent.MensCategory=pro.getProperty("menscategory");
			Constent.MensProductName=pro.getProperty("mensproductname");
			Constent.WomwnsCategory=pro.getProperty("womwnscategory");
			Constent.WomenProduct=pro.getProperty("womenproduct");
			Constent.MenProductMaxprice=pro.getProperty("MenproductMaxprice");
			Constent.MensProductSize=pro.getProperty("mensproductsize");
			Constent.Quantity=pro.getProperty("Quantity");
			Constent.WomensproductMaxprice=pro.getProperty("WomensproductMaxprice");
			Constent.Searchproduct= pro.getProperty("Searchproduct");
			Constent.SearchproductName= pro.getProperty("SearchproductName");
			Constent.ShoeSize= pro.getProperty("shoesize");
			Constent.CollectionCategory= pro.getProperty("collectioncategory");
			Constent.CollectionProductname= pro.getProperty("collectionproductname");
			
			
			
	}
	
public void LounchBrowser() {
		
		switch (Constent.Browser_Name.toLowerCase()) {
		
		case "chrome":
			try {
				
				log.info("Louching The Chrome Browser" );
				System.setProperty(Constent.system,Constent.Browser_Path);
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				driver = new ChromeDriver(option);
				wait = new WebDriverWait(driver, 30);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    driver.manage().window().maximize();
			    
			    log.info("User Given Wait StateMent ");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				jse = (JavascriptExecutor) driver;
				
			} catch (Exception e) {
				
				log.error(e.getMessage());
			}
			
			
			break;

		case  "firefox":
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
			driver = new FirefoxDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		}
	}
	
        public static void ScrollDownPage(WebElement Ele) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		   
	     jse.executeScript("arguments[0].scrollIntoView();",Ele);
	}
        
        public static void SelectProduct(String Product) throws InterruptedException {
        	
        	Product_Page product = new Product_Page(driver);
        	
        	log.info("Select The Product");
    		
            for (WebElement products : product.getProduct_Name()) {
  			
  			if(products.getText().equalsIgnoreCase(Product)) {
  				
  				Thread.sleep(3000);
  				
  				ScrollDownPage(products);
  				
                  wait.until(ExpectedConditions.visibilityOf(products)).click();
                  
  				break;
  			}
  		}
        }
        
        public static void EnterQuantityAndAddToCartProduct(String Quantitys) {
        	
        	Product_Page product = new Product_Page(driver);
        	
        	log.info("Clear The Product Quantity");
    		
            product.getQuantity().clear();
    		
            log.info("Entering The Product Quantity");
            
    		product.getQuantity().sendKeys(Quantitys);
    		
    		product.getAddToCart().click();
        }
        
        public static void ValiDateThecartProductAndQuantity(String ProductName,String Quantitys) throws InterruptedException {
        	
        	Product_Page product = new Product_Page(driver);
        	
        	Cart_Page cart = new Cart_Page(driver);
        	
            Thread.sleep(3000);
     		
     		jse.executeScript("window.scrollBy(0,-300)");
     		
     		log.info("Click On The Cart Button");
     		
     		wait.until(ExpectedConditions.visibilityOf(product.getCart_Button())).click();
     		
     		log.info("To Verify Is Selected Collections_Product Added Into The Cart page Correctly" );
     		
     	for (WebElement carts : cart.getCart_Products()) {
     		
     		if(carts.getText().equalsIgnoreCase(ProductName)) {
     			
     			System.out.println("Search Product Is Successfully Add To the Cart page");
     			break;
     		}
     	}
     	
     	log.info("To Verify The Collections_Products Quantity Is Correct Or Not ");
     	
          for (WebElement cartsize : cart.getCart_Product_Quanity()) {
     	
         	assertEquals(cartsize.getAttribute("value"), Quantitys);
         }
     	}

        }
		

