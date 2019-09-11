import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cases {

	final String CHROMEDRIVER_LOCATION = "C:\\chromedriver.exe";
//	
//	
//	final String URL_TO_TEST = "www.mcdonalds.ca";
	
	WebDriver driver;
	
	
	
	@Before
	public void setUp() throws Exception {
//		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		driver = new ChromeDriver();
		
	
		
//		driver.get(URL_TO_TEST);
	}
	@After
	public void tearDown() throws Exception {
		
		
	}
	@Test
	public void testToMycD() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.mcdonalds.com/ca/en-ca.html");

		WebElement SignupScreen = driver.findElement(By.cssSelector("a.exit"));
		SignupScreen.click();




		WebElement headline = driver.findElement(By.className("click-before-outline"));
        String headlinemsg = headline.getText();
    	assertEquals("Subscribe to My McD’s®",headlinemsg);
    	
    	Thread.sleep(5000);
		driver.close();
       
	}
	
	@Test
	public void testEmailSignup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
		WebElement SignupScreen = driver.findElement(By.cssSelector("a.exit"));
		SignupScreen.click();



		WebElement FirstName = driver.findElement(By.id("firstname2"));
		FirstName.sendKeys("Hemant");
		
		WebElement Email = driver.findElement(By.id("email2"));
		Email.sendKeys("Hemantpatel564@gmail.com");
		
		WebElement PostalCode = driver.findElement(By.id("postalcode2"));
		PostalCode.sendKeys("    M1B");

		WebElement Button = driver.findElement(By.id("g-recaptcha-btn-2"));
		WebElement Subbutton1 = driver.findElement(By.id("g-recaptcha-btn-2"));

		Button.click();
		Subbutton1.click();



		
		Thread.sleep(5000);
		driver.close();
       
	}
	
	@Test
	public void EmailSignUpFail() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.mcdonalds.com/ca/en-ca.html");

		WebElement SignupScreen = driver.findElement(By.cssSelector("a.exit"));
		SignupScreen.click();



		WebElement Subbutton2 = driver.findElement(By.id("g-recaptcha-btn-2"));
		Subbutton2.click();


    	Thread.sleep(5000);
		driver.close();
       
	}
	
	
	
	
	
}
	