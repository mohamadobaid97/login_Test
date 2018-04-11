package loginFacebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
   static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","E:\\gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mohamadobaid97@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("ddddd");
		driver.findElement(By.xpath(".//*[@data-testid='royal_login_button']")).click();

	}

}
