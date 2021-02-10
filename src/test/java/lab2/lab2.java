package lab2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		/**
		 * Open Facebook Application
		 */
		driver.get("https://www.facebook.com");

		/**
		 * Title of Page
		 */
		String strTitle = driver.getTitle();
		System.out.println("Title:" + strTitle);

		/**
		 * Url
		 */

		String url = driver.getCurrentUrl();
		System.out.println("Url:" + url);

		/**
		 * Page Source
		 */

		String strPageSource = driver.getPageSource();
		System.out.println("Page Source:" + strPageSource);
	}

}
