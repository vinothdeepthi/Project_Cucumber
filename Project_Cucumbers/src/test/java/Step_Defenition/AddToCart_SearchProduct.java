package Step_Defenition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utility.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_SearchProduct extends Utils {
	
	@Given("User Louching The Application and Browser")
	public void user_louching_the_application_and_browser() {
	    
		log.info("SearchProduct Louching The Application");
		
		driver.get(Url);
	}

	@When("User Able to Entering The Product")
	public void user_able_to_entering_the_product() {
	   
		log.info("Click on the Search Icon");
		
		dash.getSearch_Icon().click();
		
		log.info("Entering The product to The Search TextBox");
		
		dash.getSerchTextBox().sendKeys(Searchproduct);
		
		log.info("Click On Serch");
		
		dash.getSearchSubmit().click();
	}
	
	@When("User Select Search Product")
	public void user_select_search_product() {
	    
		log.info("Select The SearchProduct");
		for (WebElement search : product.getAllSerchProduct()) {
			
			if(search.getText().equalsIgnoreCase(SearchproductName)) {
				
				search.click();
				break;
			}
			
		}
	}

	@When("User Entering The Product Quantity and Select The Size Of The Product")
	public void user_entering_the_product_quantity_and_select_the_size_of_the_product() {
	    
		log.info("Select The SearchProduct Shoe Size");
		
		for (WebElement size : product.getShoeSize()) {
			
			if(size.getText().equalsIgnoreCase(ShoeSize)) {
				size.click();
				break;
			}
		}
		
		log.info("Clear The SearchProduct Quantity");
		
		product.getQuantity().clear();
		
		log.info("Entering The SearchProduct Quantity");
		
		product.getQuantity().sendKeys(Quantity);
	}

	@When("User Add The Product To The Cart page")
	public void user_add_the_product_to_the_cart_page() {
	    
		log.info("Click On SearchProduct Add To Cart Button");
		
		product.getAddToCart().click();
	}

	@Then("Validate The Product Is Correctly Add To The Cart Page and size and Quantity")
	public void validate_the_product_is_correctly_add_to_the_cart_page_and_size_and_quantity() throws InterruptedException {
	  
     
		ValiDateThecartProductAndQuantity(SearchproductName,Quantity);
	
	}


}
