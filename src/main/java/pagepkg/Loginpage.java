package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img")
	WebElement Logosi;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement Signin;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement Mail;
	@FindBy(xpath = "//*[@id=\"pass\"]")
	WebElement Pass;
	@FindBy(xpath = "//*[@id=\"send2\"]/span")
	WebElement Button;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Signinvalues()
	{
		Logosi.click();
		Signin.click();
		Mail.sendKeys("testauto0005@gmail.com");
		Pass.sendKeys("Test0@123");

}
	public void Signinvalues1()
	{
		Button.click();

}
	}
