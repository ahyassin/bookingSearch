package com.booking.test.webappTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingSearch {
	
	@Test
	public void firstWebAppTest() throws InterruptedException{
		// open booking.com
		String baseUrl = "https://www.booking.com";
		System.setProperty("webdriver.chrome.driver", "./src/source/java/driver/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get(baseUrl);
	    
	    WebDriverWait wait = new WebDriverWait(driver, 5);
	    
	    // enter Los Angeles in the search input
	    driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("Los Angeles, California, USA");
	    driver.findElement(By.xpath("//input[@id='ss']")).sendKeys(Keys.TAB);

	    // enter from and to dates
	    driver.findElement(By.xpath("//div[@data-mode='checkin']")).click();
	    wait = new WebDriverWait(driver, 1);
	    driver.findElement(By.xpath("//td[@data-date='2018-12-17']")).click();
	    driver.findElement(By.xpath("//td[@data-date='2018-12-21']")).click();
	    
	    // click on Search
	    driver.findElement(By.xpath("//button[@type='submit']/span[normalize-space()='Search']")).click();
	    wait = new WebDriverWait(driver, 10);
	    
	    // pick the first 3 elements then select a random one out of those 3
	    List<WebElement> hotelsResults = driver.findElements(By.xpath("//span[@class='b-button__text'][contains(normalize-space(),'availab')]"));
	    System.out.println("hotels list size:  "+hotelsResults.size());
	    hotelsResults = hotelsResults.subList(0,2);
	    Random rand = new Random();
	    int randomIndex = rand.nextInt(hotelsResults.size());
	    hotelsResults.get(randomIndex).click();
	    wait = new WebDriverWait(driver, 30);
	    
	    // get the list of rooms prices then get the minimum price then enter 1 room and click on I'll reserve
	    List<WebElement> roomsPrices = driver.findElements(By.xpath("//div[@class='hprt-price-price ']/span"));
	    List<WebElement> roomNo = driver.findElements(By.xpath("//select[@class='hprt-nos-select']"));
	    // got issues with getting Selenium to catch the price element
	    // the prices can be converted to int after removing $ sign then get the minimum
	    // get the index of the lowest price and add a room using the same index
  	}
}
