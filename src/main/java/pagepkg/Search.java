package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"search\"]")
	WebElement Search;
	
	public Search(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Homepagevalues()
	{
		Search.sendKeys("T shirt",Keys.ENTER);
		
	}
	
	

}
