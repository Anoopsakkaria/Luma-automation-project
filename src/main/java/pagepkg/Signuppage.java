package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement Signup;
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement FName;
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement LName;
	@FindBy(xpath = "//*[@id=\"email_address\"]")
	WebElement Mail;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement Pass;
	@FindBy(xpath = "//*[@id=\"password-confirmation\"]")
	WebElement CPass;
	@FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
	WebElement Button;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement arrowsu;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement Signoutsu;
	
	public Signuppage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	public void Signupvalues()
	{
		Signup.click();
		FName.sendKeys("Test");
		LName.sendKeys("Person");
		Mail.sendKeys("testauto0005@gmail.com");
		Pass.sendKeys("Test0@123");
		CPass.sendKeys("Test0@123");
		Button.click();
		arrowsu.click();
		Signoutsu.click();
		
	}
	
	
	

}
