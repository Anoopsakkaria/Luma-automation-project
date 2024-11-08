package testpkg;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import basepkg.Baseclass;
import pagepkg.Signuppage;

public class Signuptest extends Baseclass{
	
	
	@Test
	public void Signup() throws InterruptedException
	{
		Signuppage ob=new Signuppage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ob.Signupvalues();
		Thread.sleep(5000);
	}
	@AfterTest
	public void teardowwn()
	{
		driver.quit();
	}

}