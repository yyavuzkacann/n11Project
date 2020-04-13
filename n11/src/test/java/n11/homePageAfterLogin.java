package n11;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class homePageAfterLogin extends locators{
	
	public void homePage(String searchKey){
		ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(nameLabel));
		Assert.assertTrue(driver.findElement(By.cssSelector(nameLabel)).getText().contains("Oliver"));
		ExpectedConditions.invisibilityOfElementLocated(By.id(searchBox));
		driver.findElement(By.id(searchBox)).sendKeys(searchKey);
		driver.findElement(By.cssSelector(searchButton)).click();
	}
	
}
