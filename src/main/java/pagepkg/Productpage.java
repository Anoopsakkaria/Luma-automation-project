package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div")
	WebElement Product;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/img")
	WebElement Nxtpic;
	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-168\"]")
	WebElement Medium;
	@FindBy(xpath = "//*[@id=\"option-label-color-93-item-53\"]")
	WebElement Green;
	@FindBy(xpath = "//*[@id=\"qty\"]")
	WebElement Quantity;
	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
	WebElement Addtocartbutton;
	@FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement Carticon;
	@FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
	WebElement Proceedbutton;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[3]/div/a/span/span/img")
	WebElement Product2;
	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-170\"]")
	WebElement XL;
	@FindBy(xpath = "//*[@id=\"option-label-color-93-item-49\"]")
	WebElement Black;
	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
	WebElement Addtocartbutton2;
	
	public Productpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Productvalues()
	{
		Product.click();
		
	}
	public void productvalues1()
	{
		Nxtpic.click();
		
	}
	public void productvalues2()
	{
		Medium.click();
	}
	
	public void productvalues3()
	{
		Green.click();
	}
	
	public void productvalues4()
	{
		Quantity.sendKeys(Keys.CONTROL+"a");
		Quantity.sendKeys(Keys.BACK_SPACE);
		Quantity.sendKeys("2");
	}
	
	public void productvalues5()
	{
		Addtocartbutton.click();
	}
	
	
	
	
	
	public void productvalues6()
	{
		Product2.click();
	}
	public void productvalues7()
	{
		XL.click();
	}
	public void productvalues8()
	{
		Black.click();
	}
	public void productvalues9()
	{
		Addtocartbutton2.click();
	}
	public void productvalues10()
	{
		Carticon.click();
	}
	
	public void productvalues11()
	{
		Proceedbutton.click();
	}
	
	
	
	
}
