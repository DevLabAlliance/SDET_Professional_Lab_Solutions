package lab8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab8_1_2 {

	WebDriver driver;
	
	@Test
	public void launch1() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Page Title:"+driver.getTitle());

		assertEquals(driver.getTitle(), "OrangeHRM");

	}

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
}
