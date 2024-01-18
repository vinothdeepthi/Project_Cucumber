package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='sf__btn sf__btn-primary']")
	private WebElement Register_Link;
	
	@FindBy(name = "customer[first_name]")
	private WebElement FistName;
	
	@FindBy(name = "customer[last_name]")
	private WebElement LastName;
	
	@FindBy(name = "customer[email]")
	private WebElement Email;
	
	@FindBy(name = "customer[password]")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@class='mt-6 mb-3 w-full sf__btn sf__btn-primary']")
	private WebElement Register_Button;
	
    public Registration_page (WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
    
    public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegister_Link() {
		return Register_Link;
	}

	public WebElement getFistName() {
		return FistName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getRegister_Button() {
		return Register_Button;
	}
}
