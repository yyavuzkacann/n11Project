package n11;

import org.junit.Assert;
import org.openqa.selenium.By;

public class secondPage extends locators {
	
	public void second(String secondPageCheckUrl) throws InterruptedException {
		Assert.assertTrue(driver.getCurrentUrl().contains(secondPageCheckUrl));
		driver.findElement(By.cssSelector(product)).click();
		Thread.sleep(2000);
	}

}
