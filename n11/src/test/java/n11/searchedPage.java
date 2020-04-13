package n11;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class searchedPage extends locators{
	
	public void searched(String searchKey) {
		Assert.assertTrue(driver.getCurrentUrl().contains(searchKey));
		ExpectedConditions.presenceOfElementLocated(By.xpath(secondButton));
		driver.findElement(By.xpath(secondButton)).click();
	}
}
