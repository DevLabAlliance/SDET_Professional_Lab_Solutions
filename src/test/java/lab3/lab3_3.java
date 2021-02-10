package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab3_3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");

		// userid
		WebElement we = driver.findElement(By.cssSelector("input[name=email]"));
		we.sendKeys("ABDevilliers@virat.com");
		// password
		we = driver.findElement(By.cssSelector("input[id=pass]"));
		we.sendKeys("ABD@17");
		// button
		we = driver.findElement(By.cssSelector("#u_0_b")); // by id
		we.click();
	}

}
