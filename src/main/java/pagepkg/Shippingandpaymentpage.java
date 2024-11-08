package pagepkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shippingandpaymentpage {
	WebDriver driver;
	@FindBy(name =  "firstname") 
	WebElement Fname;
	@FindBy( name =  "lastname")
	WebElement Lname;
	@FindBy(name =  "company")
	WebElement Company;
	@FindBy(name =  "street[0]")
	WebElement Street1;
	@FindBy(name  = "street[1]")
	WebElement Street2;
	@FindBy(name = "street[2]")
	WebElement Street3;
	@FindBy(name  = "city")
	WebElement City;
	@FindBy(name = "region_id")
	WebElement Statedropdown;
	@FindBy(name = "postcode")
	WebElement Postcode;
	@FindBy(name = "country_id")
	WebElement Countrydropdown;
	@FindBy(name  = "telephone")
	WebElement Phone;
	@FindBy(name = "ko_unique_2")
	WebElement Radiobutton;
	@FindBy(xpath  = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
	WebElement Nextbutton;
	@FindBy(xpath =  "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
	WebElement Placeorder;
	
	public Shippingandpaymentpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Shippingvalues()
	{
		Fname.sendKeys(Keys.CONTROL+"a");
		Fname.sendKeys(Keys.BACK_SPACE);
		Fname.sendKeys("Joseph");
		Lname.sendKeys(Keys.CONTROL+"a");
		Lname.sendKeys(Keys.BACK_SPACE);
		Lname.sendKeys("Claynes");
		Company.sendKeys("Santa monica");
		Street1.sendKeys("Dunhill");
		Street2.sendKeys("Madison square");
		Street3.sendKeys("4 Avenue");
		City.sendKeys("New york");
		Postcode.sendKeys("12345");
		Phone.sendKeys("7856320214");
		Radiobutton.click();
		
		
		
		
	}
	public void dropdown()
	{
		 Select dropdown1 = new Select(Statedropdown);
		dropdown1.selectByValue("3");
		
	}
	public void buttonclick()
	{
		Nextbutton.click();
		
	}
	public void Orderclick()
	{
		Placeorder.click();
	}
	
	
	
	

}
