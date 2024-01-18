package Step_Defenition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utility.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_Collections_Products extends Utils {
	
	@Given("Louchings The Browser and Application")
	public void louchings_the_browser_and_application() {

		log.info("Collections_Products Louching The Application");
		
		driver.get(Url);
	}

	@When("User Able to Select The Collections Category")
	public void user_able_to_select_the_collections_category() {
	   
         Actions act = new Actions(driver);
         
         log.info("Mouse Move Operation Using To Perform An Elementa And Click Thet Element of Collection  ");
		
		act.moveToElement(dash.getCollection()).perform();
		
		log.info("to Select The Collection category");
		
		for (WebElement category : dash.getAll_Collection_Category()) {
			
         if(category.getText().equalsIgnoreCase(CollectionCategory)) {
        	 
        	 act.moveToElement(category).click().perform();
        	 break;
         }

		}	
	}

	@When("User Able To Filter The Collections Product")
	public void user_able_to_filter_the_collections_product() throws InterruptedException {
	    
		log.info("Click On the Collections_Products Filter Button");
		
       product.getFilter_Button().click();
		
       log.info("Entering The maximum Price Range Of Collections_Products");
       
		product.getMax_Price().sendKeys(MenProductMaxprice);
		
		Thread.sleep(2000);
		
		log.info("Click On the Collections_Products Filter Button");
		
		product.getFilter_Button().click();
		
		log.info("click On Collections_Products Size ");
		
		product.getSize().click();
		
		log.info("to Select The Collections_Products Size Range");
		
		for (WebElement filter :product.getFilter_Options()) {
			
			if(filter.getText().equalsIgnoreCase(MensProductSize)) {
				
				filter.click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		log.info("Click On the Collections_Products Filter Button");
		
		product.getFilter_Button().click();
		
		log.info("click On The Collections_Products Brand ");
		
		product.getFilter_Brand().click();
		
		log.info("Select The Collections_Products Brand");
		
        for (WebElement filter :product.getFilter_Options()) {
			
			if(filter.getText().equalsIgnoreCase("Koovs")) {
				
				filter.click();
				break;
			}
			
		}
        
        Thread.sleep(2000);
        
        jse.executeScript("window.scrollBy(0,-300)");
		
        log.info("Click On The Collections_Products Filter Dropdown");
        
       product.getFeatureFilter().click();
       
       log.info("Select The Collections_Products Filter Dropdown Options");
       
       for (WebElement fil : product.getFeatureFilterOptions()) {
		
    	   if(fil.getText().equalsIgnoreCase("Best selling")) {
    		   fil.click();
    		   break;
    	   }
	}
	}
	

	@When("User Select The Collections Product")
	public void user_select_the_collections_product() throws InterruptedException {
		
		SelectProduct(CollectionProductname);
	}

	@When("User Entering The Product Quantity and User Add The Collections Product To Cart page")
	public void user_entering_the_product_quantity_and_user_add_the_collections_product_to_cart_page() {
	
		log.info("Click On Collections_Products Add To Cart Button");
		
		EnterQuantityAndAddToCartProduct(Quantity);
		
	}

	@Then("Validate The Collections Product Is Correctly Add To The Cart Page Or Not and Verify The Quantity")
	public void validate_the_collections_product_is_correctly_add_to_the_cart_page_or_not_and_verify_the_quantity() throws InterruptedException {
	   
		ValiDateThecartProductAndQuantity(CollectionProductname,Quantity);

}
}