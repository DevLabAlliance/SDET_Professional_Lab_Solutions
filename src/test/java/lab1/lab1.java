package lab1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1 {

	public static void main(String[] args) {

	
		/**
		 * Launch Browser
		 */
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/**
		 * Maximize browser
		 */
		driver.manage().window().maximize();
		/**
		 * Open Application
		 */
		driver.get("https://www.google.com");
		/**
		 * Close Driver instance
		 */
		driver.close();
	}

}
