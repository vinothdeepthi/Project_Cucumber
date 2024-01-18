package Step_Defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Constentes.Constent;
import Utility.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_Mens_Product extends Utils {
	
	@Given("User Louching The Application")
	public void user_louching_the_application() {
	    
		log.info("Mens_Product Louching The Application");
		
		driver.get(Url);
	 
	}

	@When("User Able to Select The Mens Category")
	public void user_able_to_select_the_mens_category() {
		
		Actions act = new Actions(driver);
		
		log.info("Mouse Move Operation Using To Perfor An Elementa And Click Thet Element of Mens_Product ");
		
		act.moveToElement(dash.getMen()).perform();
		
		log.info("to Select The Mens category");
		
		for (WebElement category : dash.getAll_Category()) {
			
         if(category.getText().equalsIgnoreCase(MensCategory)) {
        	 
        	 act.moveToElement(category).click().perform();
        	 break;
         }

		}
		
	}

	@When("User Able To Filter The Product")
	public void user_able_to_filter_the_product() throws InterruptedException {
	    
		log.info("Click On the Mens_Product Filter Button");
		
		product.getFilter_Button().click();
		
		log.info("Entering The Mens_Product maximum Price Range");
		
		product.getMax_Price().sendKeys(MenProductMaxprice);
		
		Thread.sleep(3000);
		
		log.info("Click On the Mens_Product Filter Button");
	
		
		wait.until(ExpectedConditions.elementToBeClickable(product.getFilter_Button())).click();
		
		log.info("click On The Mens_Product Size ");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(product.getSize())).click();
		
		log.info("to Select The Mens_Product Size Range");
		
		for (WebElement filter :product.getFilter_Options()) {
			
			if(filter.getText().equalsIgnoreCase(MensProductSize)) {
				
				filter.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		log.info("Click On the Mens_Product Filter Button");
		
		wait.until(ExpectedConditions.elementToBeClickable(product.getFilter_Button())).click();
		
		log.info("click On The Mens_Product Brand ");
		
		product.getFilter_Brand().click();
		
		log.info("Select The Mens_Product Brand");
		
        for (WebElement filter :product.getFilter_Options()) {
			
			if(filter.getText().equalsIgnoreCase("Bravesoul")) {
				
				filter.click();
				break;
			}
			
		}
		
       Thread.sleep(3000);
	}
	
	

	@When("User Select The Product")
	public void user_select_the_product() throws InterruptedException {
	    
		SelectProduct(MensProductName);
	}

	@When("User Entering The Product Quantity and User Add The Product To Cart page")
	public void user_entering_the_product_quantity_and_user_add_the_product_to_cart_page() {
		
		log.info("Click On Mens_Products Add To Cart Button");
	   
		EnterQuantityAndAddToCartProduct(Quantity);
		
	}

	@Then("Validate The Product Is Correctly Add To The Cart Page")
	public void validate_the_product_is_correctly_add_to_the_cart_page() throws InterruptedException {
	    
	
		ValiDateThecartProductAndQuantity(MensProductName,Quantity);
	}


}
