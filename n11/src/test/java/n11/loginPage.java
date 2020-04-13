package n11;

import org.openqa.selenium.By;

public class loginPage extends locators {
	
	public void login(String email,String pass) {
		driver.findElement(By.xpath(mail)).sendKeys(email);
		driver.findElement(By.id(password)).sendKeys(pass);
		driver.findElement(By.id(submitButton)).click();
	}
}
