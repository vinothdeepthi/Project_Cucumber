package Page_Object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

WebDriver driver;
	
	@FindBys({@FindBy(xpath = "//span[@data-behavior='variable-product_title']")})
	private List<WebElement> Product_Name;
	
	@FindBys({@FindBy(xpath = "//h3[@class='block text-base']//a")})
	private List<WebElement> AllSerchProduct;

	@FindBy(xpath = "//span[text()='Filter']")
	private WebElement Filter_Button;
	
	@FindBy(xpath = "//input[@data-type='min-input']")
	private WebElement Min_Price;
	
	@FindBy(xpath = "//input[@data-type='max-input']")
	private WebElement Max_Price;
	
	@FindBys({@FindBy(xpath = "//span[@class='filter-label']")})
	private List<WebElement> Filter_Options;
	
	@FindBy(xpath = "//span[text()='Size']")
	private WebElement Filter_Size;
	
	@FindBy(xpath = "//span[text()='Brand']")
	private WebElement Filter_Brand;
	
	@FindBy(xpath = "//label[@for='template--19215965323563__main-1-0']")
	private WebElement Size_S;
	
	@FindBy(name = "quantity")
	private WebElement Quantity;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement AddToCart;
	
	@FindBy(xpath = "(//span[@class='sf__tooltip-item block sf__tooltip-bottom sf__tooltip-style-2'])[5]")
	private WebElement Cart_Button;
	
	@FindBy(xpath = "//span[text()='Size']")
	private WebElement Size;
	
	@FindBys({@FindBy(xpath = "//label[@class='product-option-item sf-po__option-button border border-color-border flex items-center justify-center mr-2 mb-2 cursor-pointer variant-picker__option-button variant-picker__option-button--button']")})
	private List<WebElement> ShoeSize;
	
	@FindBy(xpath = "(//div[@class='select-selected'])[2]")
	private WebElement FeatureFilter;
	
	@FindBys({@FindBy(xpath = "//div[@class='select-items']//div")})
	private List<WebElement> FeatureFilterOptions;
	
	 public WebElement getFeatureFilter() {
		return FeatureFilter;
	}

	public List<WebElement> getFeatureFilterOptions() {
		return FeatureFilterOptions;
	}

	public List<WebElement> getShoeSize() {
		return ShoeSize;
	}

	public Product_Page(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
	 
	 public WebDriver getDriver() {
			return driver;
		}

		public List<WebElement> getProduct_Name() {
			return Product_Name;
		}

		public WebElement getFilter_Button() {
			return Filter_Button;
		}

		public WebElement getMin_Price() {
			return Min_Price;
		}

		public WebElement getMax_Price() {
			return Max_Price;
		}

		public List<WebElement> getFilter_Options() {
			return Filter_Options;
		}

		public WebElement getFilter_Size() {
			return Filter_Size;
		}

		public WebElement getFilter_Brand() {
			return Filter_Brand;
		}

		public WebElement getSize_S() {
			return Size_S;
		}

		public WebElement getQuantity() {
			return Quantity;
		}

		public WebElement getAddToCart() {
			return AddToCart;
		}

		public WebElement getCart_Button() {
			return Cart_Button;
		}

		public WebElement getSize() {
			return Size;
		}
		
		public List<WebElement> getAllSerchProduct() {
			return AllSerchProduct;
		}
}
