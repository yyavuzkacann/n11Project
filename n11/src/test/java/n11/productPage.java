package n11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class productPage extends locators{
	public void product() throws InterruptedException {
		driver.findElement(By.cssSelector(wishButton)).click();
		driver.findElement(By.cssSelector(addWishList)).click();
		Thread.sleep(2000);
	    Actions action = new Actions(driver);
	    WebElement elem = driver.findElement(By.cssSelector("header#header a.menuTitle"));
	    action.moveToElement(elem);
	    action.perform();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector("header#header div.myAccountMenu.hOpenMenu > div > a:nth-child(2)")).click();
	}
}
