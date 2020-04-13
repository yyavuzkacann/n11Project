package n11;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class baseClass extends locators {
	@Test
	public void A_navigate() throws InterruptedException {
		
		navigate navigateObj = new navigate();
		navigateObj.goToUrl();
	
	}

	@Test  
	public void B_login() {

		loginPage loginObj = new loginPage();
		loginObj.login("ninage5008@govdep5012.com", "yavuz123");

	}

	@Test 
	public void C_searching() {

		homePageAfterLogin searchObj = new homePageAfterLogin();
		searchObj.homePage("samsung");

	}

	@Test 
	public void D_searched() {
		
		searchedPage searchedObj = new searchedPage();
		searchedObj.searched("samsung");
		
	}
	
	@Test
	public void E_secondPage() throws InterruptedException {
		
		secondPage findProduct = new secondPage();
		findProduct.second("pg=2");
		
	}
	
	@Test
	public void F_product() throws InterruptedException {
		
		productPage productObj = new productPage();
		productObj.product();
		
	}
	
	@Test
	public void G_wishList() throws InterruptedException {
		
		wishListPage wishListObj = new wishListPage();
		wishListObj.wishList();
		
	}
}
