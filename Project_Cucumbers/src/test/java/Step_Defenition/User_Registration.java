package Step_Defenition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Utility.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_Registration extends Utils {
	
	
	@Given("User Able To Lounch The Application")
	public void user_able_to_lounch_the_application() {
		
		log.info(" Registration Louching The Application");
		
		driver.get(Url);
	}

	@When("User Able To Navigate The Registration Page")
	public void user_able_to_navigate_the_registration_page() {

		log.info("Click On The Registration Account Logo");
		
		try {
			
			dash.getAccount_Logo().click();
			
			log.info("click on The Registration Register Link");
			
			reg.getRegister_Link().click();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

	@When("User Entering The Valid FirstName and lastName")
	public void user_entering_the_valid_first_name_and_last_name() {
	    
		log.info("Entering The Registration FistName");
		
		try {
			
			reg.getFistName().sendKeys(FirstName);
			
			log.info("Entering The Registration LastName");
			
			reg.getLastName().sendKeys(LastName);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	@When("User Entering The Valid Emailn and Password")
	public void user_entering_the_valid_emailn_and_password() {
		
		log.info("Entering The Registration EmailId");
		
		try {
			
			reg.getEmail().sendKeys(Email);
		       
		       log.info("Entering The Registration Password");
				
		       reg.getPassword().sendKeys(Password);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
       
		
	}

	@When("User Click On The Register button")
	public void user_click_on_the_register_button() {

		log.info("click Onr register Button");
		
		try {
			
			 reg.getRegister_Button().click();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
    
		
	}

	@Then("Validate The User Name Is Successfully Registered")
	public void validate_the_user_name_is_successfully_registered() throws InterruptedException {

		Thread.sleep(2000);
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(dash.getAccount_Logo())).click();
			
		       log.info("Validating The Registration Profile Name ");
		       
		      Assert.assertEquals(dash.getProfile_Name().getText(), ProfileName);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
       
		
	}

}
