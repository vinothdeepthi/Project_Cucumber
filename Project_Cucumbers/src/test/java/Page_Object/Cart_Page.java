package Page_Object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
WebDriver driver;
	
	@FindBys({@FindBy(xpath = "//a[@data-role='product-title']")})
	private List<WebElement> Cart_Products;
	
	@FindBys({@FindBy(xpath = "//input[@class='py-1 scd-item__qty_input w-9 text-center']")})
	private List<WebElement> Cart_Product_Quanity;
	
	
	
	

	 public List<WebElement> getCart_Product_Quanity() {
		return Cart_Product_Quanity;
	}

	public Cart_Page(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
	 
	 public WebDriver getDriver() {
			return driver;
		}

		public List<WebElement> getCart_Products() {
			return Cart_Products;
		}
	

}
