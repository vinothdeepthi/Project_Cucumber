package Step_Defenition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utility.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_WoMens_Products extends Utils {
	
	@Given("User Louching The Browser and Application")
	public void user_louching_the_browser_and_application() {
		
		log.info("WoMens_Products Louching The Application");
		
		driver.get(Url);
	}

	@When("User Able to Select The Womens Category")
	public void user_able_to_select_the_womens_category() {
	    
		try {
			
			Actions act = new Actions(driver);
	        
	        log.info("Mouse Move Operation Using To Perfor An Elementa And Click Thet Element Of WoMens_Products ");
	        
			act.moveToElement(dash.getWomens()).perform();
			
			log.info("To Select The Womens category");
			
			for (WebElement category : dash.getAll_Category()) {
				
	         if(category.getText().equalsIgnoreCase(WomwnsCategory)) {
	        	 
	        	 act.moveToElement(category).click().perform();
	        	 break;
	         }

			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
        
	}

	@When("User Able To Filter The Womens Product")
	public void user_able_to_filter_the_womens_product() throws InterruptedException {
		
		log.info("Click On the WoMens_Products Filter Button");
		
		try {
			
			product.getFilter_Button().click();
			
	        log.info("Entering The WoMens_Products maximum Price Range");
	        
			product.getMax_Price().sendKeys(WomensproductMaxprice);
			
			Thread.sleep(3000);
			log.info("Click On the WoMens_Products Filter Button");
			
			product.getFilter_Button().click();
			
			log.info("click On The WoMens_Products Size ");
			
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.elementToBeClickable(product.getSize())).click();
			
			log.info("to Select The WoMens_Products Size Range");
			
			for (WebElement filter :product.getFilter_Options()) {
				
				if(filter.getText().equalsIgnoreCase("M")) {
					
					filter.click();
					break;
				}
				
			}
			
			Thread.sleep(3000);
			
			log.info("Click On the WoMens_Products Filter Button");
			
			wait.until(ExpectedConditions.elementToBeClickable(product.getFilter_Button())).click();
			
			log.info("click On The WoMens_Products Brand ");
			
			product.getFilter_Brand().click();
			
			log.info("Select The WoMens_Products Brand");
			
	        for (WebElement filter :product.getFilter_Options()) {
				
				if(filter.getText().equalsIgnoreCase("Koovs Sport")) {
					
					filter.click();
					break;
				}
				
			}
			
	       Thread.sleep(3000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
        
	}
	
	@When("User Select The Womens Product")
	public void user_select_the_womens_product() throws InterruptedException {
		
		try {
			
			SelectProduct(WomenProduct);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	    
	}

	@When("User Entering The Product Quantity and User Add The Womens Product To Cart page")
	public void user_entering_the_product_quantity_and_user_add_the_womens_product_to_cart_page() {
		
		log.info("Click On Womens_Products Add To Cart Button");
		
		try {
			
			EnterQuantityAndAddToCartProduct(Quantity);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	    
	}

	@Then("Validate The Womens Product Is Correctly Add To The Cart Page Or Not")
	public void validate_the_womens_product_is_correctly_add_to_the_cart_page_or_not() throws InterruptedException {
	    
       
		try {
			
			ValiDateThecartProductAndQuantity(WomenProduct,Quantity);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
