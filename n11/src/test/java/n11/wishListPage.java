package n11;

import org.junit.Assert;
import org.openqa.selenium.By;

public class wishListPage extends locators{
	
	public void wishList() throws InterruptedException {
		driver.findElement(By.cssSelector(orders)).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(listCheck)).getText().contains("Favorilerim"));
		Assert.assertTrue(driver.findElement(By.cssSelector(removeProductButton)).getText().contains("Sil"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(removeProductButton)).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(removedPopup)).isDisplayed());
	}
	
}
