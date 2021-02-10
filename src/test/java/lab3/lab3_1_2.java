package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab3_1_2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
	
		/**
		 * XPath
		 */
		WebElement we = driver.findElement(By.xpath("//input[@name='q']"));
		we.sendKeys("AB Devilliers");
		we.clear();
		
		
		/**
		 * CSS Selector
		 */
		we=driver.findElement(By.cssSelector("input[name=q]"));
		we.sendKeys("AB Devilliers");
		we.clear();
		
		
		
		
	}

}
