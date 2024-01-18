package Page_Object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DashBoard_Page {
	
	WebDriver driver;

	@FindBy(xpath = "(//span[@class='sf__tooltip-item block sf__tooltip-bottom sf__tooltip-style-2'])[3]")
	private WebElement Account_Logo;
	
	@FindBy(xpath = "(//span[@class='font-semibold'])[1]")
	private WebElement Profile_Name;
	
	@FindBy(xpath = "(//a[@class='block px-4 py-5 sf__sub-menu-link1 flex items-center sf__parent-item'])[1]")
	private WebElement Men;
	
	@FindBys({@FindBy(xpath = "//a[@class='sf-sub-menu__link']")})
	private List<WebElement> All_Category;
	
	@FindBys({@FindBy(xpath = "//a[@class='sf__sub-menu-link2 whitespace-normal block sf-sub-menu__link']")})
	private List<WebElement> All_Collection_Category;
	
	public List<WebElement> getAll_Collection_Category() {
		return All_Collection_Category;
	}

	@FindBy(name = "customer[email]")
	private WebElement Login_Email;
	
	@FindBy(name = "customer[password]")
	private WebElement Login_Password;
	
	@FindBy(xpath = "//form[@id='customer_login']//button")
	private WebElement SignIn_Button;
	
	@FindBy(xpath = "(//span[@class='sf__tooltip-item block sf__tooltip-bottom sf__tooltip-style-2'])[2]")
	private WebElement Search_Icon;
	
	@FindBys({@FindBy(xpath = "//h3[@class='block text-base']//a")})
	private List<WebElement> Dash_All_Product;
	
	@FindBy(xpath = "(//a[@class='hidden sm:block sf-tab-header mx-6'])[1]")
	private WebElement NewArrival_Mens;
	
	@FindBy(xpath = "(//a[@class='hidden sm:block sf-tab-header mx-6 active'])[1]")
	private WebElement NewArrival_Womens;
	
	@FindBy(xpath = "(//a[@class='hidden sm:block sf-tab-header mx-6'])[2]")
	private WebElement Yash_Kovves;
	
	@FindBy(xpath = "(//a[@class='block px-4 py-5 sf__sub-menu-link1 flex items-center sf__parent-item'])[2]")
	private WebElement Womens;
	
	@FindBy(name = "q")
	private WebElement SerchTextBox;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement SearchSubmit;
	
	@FindBy(xpath = "(//a[@class='block px-4 py-5 sf__sub-menu-link1 flex items-center sf__parent-item'])[5]")
	private WebElement Collection;
	
	
	
	public WebElement getCollection() {
		return Collection;
	}

	public WebElement getSerchTextBox() {
		return SerchTextBox;
	}

	public WebElement getSearchSubmit() {
		return SearchSubmit;
	}

	public WebElement getWomens() {
		return Womens;
	}

	public WebElement getNewArrival_Mens() {
		return NewArrival_Mens;
	}

	public WebElement getNewArrival_Womens() {
		return NewArrival_Womens;
	}

	public WebElement getYash_Kovves() {
		return Yash_Kovves;
	}
	
	 public WebElement getSearch_Icon() {
		return Search_Icon;
	}

	public List<WebElement> getDash_All_Product() {
		return Dash_All_Product;
	}

	public WebElement getLogin_Email() {
		return Login_Email;
	}

	public WebElement getLogin_Password() {
		return Login_Password;
	}

	public WebElement getSignIn_Button() {
		return SignIn_Button;
	}

	public DashBoard_Page(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
	 
	 public WebDriver getDriver() {
			return driver;
		}

		public WebElement getAccount_Logo() {
			return Account_Logo;
		}

		public WebElement getProfile_Name() {
			return Profile_Name;
		}

		public WebElement getMen() {
			return Men;
		}

		public List<WebElement> getAll_Category() {
			return All_Category;
		}
	


}
