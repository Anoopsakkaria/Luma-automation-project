package testpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Search;
import pagepkg.Shippingandpaymentpage;
import pagepkg.Signuppage;
import pagepkg.Finalpage;
import pagepkg.Loginpage;
import pagepkg.Productpage;

public class Lumatest extends Baseclass {
	@Test(priority = 1)
	public void Title()
	{
		//Title verification
		String actualtitle=driver.getTitle();
		String exptitle="Home Page";
		System.out.println("Actualtitle="+actualtitle);
		System.out.println("Expectedtitle="+exptitle);
		Assert.assertEquals(actualtitle,exptitle,"title verification");
		System.out.println("verified");
	}
	
	@Test(priority = 2)
	public void Lumalogin() throws InterruptedException
	{
		Loginpage ob=new Loginpage(driver);
		ob.Signinvalues();
		ob.Signinvalues1();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public void Home()
	{
		Search ob1=new Search(driver);
		ob1.Homepagevalues();
	}
	
	@Test(priority = 4)
	public void Product() throws InterruptedException
	{
		Productpage ob2=new Productpage(driver);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ob2.Productvalues();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)");
		ob2.productvalues1();
		Thread.sleep(2000);
		ob2.productvalues2();
		Thread.sleep(2000);
		ob2.productvalues3();
		Thread.sleep(2000);
		ob2.productvalues4();
		Thread.sleep(2000);
		ob2.productvalues5();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		ob2.productvalues6();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-56\"]"));
        // Scroll to the element location
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
		ob2.productvalues7();
		Thread.sleep(2000);
		ob2.productvalues8();
		Thread.sleep(2000);
		ob2.productvalues9();
		Thread.sleep(2000);
		ob2.productvalues10();
		Thread.sleep(2000);
		ob2.productvalues11();
		Thread.sleep(2000);
		
	}
	@Test(priority = 5)
	public void Shipping() throws InterruptedException
	{
		Shippingandpaymentpage ob3=new Shippingandpaymentpage(driver);
		ob3.Shippingvalues();
		//Scrolling using pixel values
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");

		ob3.dropdown();
		Thread.sleep(2000);
		 
		ob3.buttonclick();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")); // Replace with your element's ID or locator

        // Scroll to the element location
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        ob3.Orderclick();
			
	}
	
	@Test(priority = 6)
	public void Final() throws InterruptedException
	{
		Finalpage ob3=new Finalpage(driver);
		ob3.Finalvalues();
		Thread.sleep(5000);

	}
	@AfterTest
	public void teardowwn()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
