package lab4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab4_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			System.out.println(childWindow);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (!parentWindow.equals(childWindow)) {
				String strUrl = driver.switchTo().window(childWindow).getCurrentUrl();
				System.out.println(strUrl);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title:" + driver.getTitle());

	}

}
