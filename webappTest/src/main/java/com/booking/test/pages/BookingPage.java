package com.booking.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class BookingPage {
//	WebElement = driver.findElement(By.cssSelector(".location_block__header_title"));.
	
	@FindBy(how = How.CSS, using = ".location_block__header_title")
	public WebElement something ;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ss']") 
	public WebElement searchBox;

	@FindBy(how = How.XPATH, using = "//div[@data-mode='checkin']")
	public WebElement checkInBox;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']/span[normalize-space()='Search']")
	public WebElement searchBtn;

	@FindBy(how = How.XPATH, using = "//span[@class='b-button__text'][contains(normalize-space(),'availab')]")
	public List<WebElement> hotelsResults;
	
	@FindBy(how = How.XPATH, using = "//div[@class='hprt-price-price ']/span")
	public List<WebElement> roomsPrices;
	
	@FindBy(how = How.XPATH, using = "//select[@class='hprt-nos-select']")
	public List<WebElement> roomsNo;
	
	@FindBy(how = How.ID, using = "ss")
	WebElement searchInput;
	
	@FindBy(how = How.CSS, using = "#setup-child-menu > li:nth-child(5) > a")
	WebElement forecastLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Templates']")
	WebElement templatesLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Performance']")
	WebElement performanceLink;

	@FindBy(how = How.XPATH, using = "//a[@title='Resources']")
	WebElement resource;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Help']")
	WebElement help;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Profile']")
	WebElement profile;
	
	@FindBy(how = How.ID, using = "filemanagement")
	WebElement fileManagementLink;

	@FindBy(how = How.ID, using = "organizationselection")
	WebElement organizationSelectionLink;

	@FindBy(how = How.CSS, using = ".dockbar")
	WebElement userMenu;

	@FindBy(how = How.CSS, using = ".dockbar .user-links > .user-fullname")
	WebElement userName;

	@FindBy(how = How.CSS, using = ".user-avatar-menu .edit-profile")
	WebElement editProfile;

	@FindBy(how = How.CSS, using = ".user-avatar-menu .sign-out > a")
	WebElement signOut;
	
	public BookingPage(){
		super();
	}

//	public WebElement getUsernameText(){
//		return usernameText;
//	}
//	public void loginPageValidation(){
//		usernameText.isDisplayed();
//		passwordText.isDisplayed();
//		logInButton.isDisplayed();
//	}
}
