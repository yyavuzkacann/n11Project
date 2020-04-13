package n11;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate extends locators {
	public void goToUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.n11.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("n11.com"));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(loginButton)).click();	
	}
	
}
