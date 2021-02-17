package lab6;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab6_2 {

	WebDriver driver;

	@Test(priority = 0)
	public void launch1() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Page Title:"+driver.getTitle());

		assertEquals(driver.getTitle(), "OrangeHRM");

		login();
		
	}

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test(priority = 1)
	public void admin()
	{
		
		driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']/li[1]")).click();
		//driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		
		
		List<WebElement> al=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
	
		for (WebElement we : al) {
			System.out.println(we.getText());
		}
		
		
		
		
		
		
		
	}
	

	
	
}
