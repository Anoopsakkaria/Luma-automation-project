package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalpage {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img")
	WebElement Logo;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement Arrow;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement Signoutbutton;
	
	public Finalpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Finalvalues()
	{
		Logo.click();
		Arrow.click();
		Signoutbutton.click();
	}

}
