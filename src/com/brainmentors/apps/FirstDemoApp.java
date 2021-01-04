package com.brainmentors.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoApp {

	public static void main(String[] args) throws InterruptedException {
		// Load the Driver
		// c:\\abcd\\chromedriver.exe     windows
		System.setProperty("webdriver.chrome.driver",
				"/Users/amit/Documents/seleniumdailycodes/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//twotabsearchtextbox
		WebElement element  = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Get It by Tomorrow")).click();
		Thread.sleep(5000); // 5 sec
		driver.close();
		//driver.quit();
		

	}

}
