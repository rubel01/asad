import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RubelLogin
{

		FirefoxDriver browser =new FirefoxDriver();
		
		@Before
		public void start()
		{
							        		
			browser.get("http://www.facebook.com");
					}
		@After
		public void end() throws Exception
		{
			Thread.sleep(5000);
			browser.close();
			
		}
		
		@Test
		public void login()
		{
			browser.findElement(By.id("email")).sendKeys("mdrubel2001@yahoo.com");
			browser.findElement(By.id("pass")).sendKeys("pass123");
			
			
		}

		
	

}	

