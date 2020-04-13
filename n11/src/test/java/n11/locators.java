package n11;

import org.openqa.selenium.WebDriver;

public class locators {
	public static WebDriver driver = null;

	static String loginButton = "header#header a.btnSignIn";
	static String mail = "//*[@id=\"email\"]";
	static String password = "password";
	static String submitButton = "loginButton";
	static String nameLabel = "header#header a.menuLink.user";
	static String searchBox = "searchData";
	static String searchButton = "header#header div.searchBox.withLocalization > a";
	static String secondButton = "/html/body/div[1]/div[2]/div/div/div[2]/div[4]/a[2]";
	static String product = "div#view li:nth-child(3) > div > div.pro > a > h3";
	static String wishButton = "a#getWishList";
	static String addWishList = "a#addToFavouriteWishListBtn";
	static String orders = "div#myAccount li.wishGroupListItem.favorites > div > a > h4";
	static String listCheck = "div#myAccount h2";
	static String removedPopup = "div.lightBox > div";
	static String removeProductButton = "div#view div.wishProBtns > span";	
}
