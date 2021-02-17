package lab6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LearnItestListeners.class)
public class Lab1_1 {

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

	@Test
	public void launch2() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Page Title:"+driver.getTitle());

		assertEquals(driver.getTitle(), "OrangeHRM1");

	}
	
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test
	public void DashboardExistence()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login();
		boolean b=driver.findElement(By.xpath("//*[@id='menu_dashboard_index']/b")).isDisplayed();
		assertEquals(b, true);
	}

}
