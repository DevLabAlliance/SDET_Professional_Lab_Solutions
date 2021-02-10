package lab4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab4_1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		/**
		 * Simple Alert
		 */
		driver.findElement(By.id("alertButton")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
		
		/**
		 * Prompt Alert
		 */
		driver.findElement(By.id("promtButton")).click();
		al = driver.switchTo().alert();
		String alertTxt=al.getText();
		System.out.println("ALert Text:"+alertTxt);
		al.sendKeys("Automation Testing");
		al.accept();
		
		
		/**
		 * Confirmation Alert
		 */
		driver.findElement(By.id("confirmButton")).click();
		al = driver.switchTo().alert();
		alertTxt=al.getText();
		System.out.println("ALert Text:"+alertTxt);
		
		al.accept();
		
		
		
	}

}
