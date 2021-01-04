package com.brainmentors.apps;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.brainmentors.utils.ConfigReader;
import com.brainmentors.utils.Constants;

public class FirstDemoApp {

	public static void main(String[] args) throws InterruptedException {
		// Load the Driver
		// c:\\abcd\\chromedriver.exe     windows
		//ConfigReader cr = new ConfigReader();
		
		System.setProperty(ConfigReader.getValue(Constants.DRIVER_NAME),
				ConfigReader.getValue(Constants.DRIVER_PATH));
		WebDriver driver = new ChromeDriver();
		driver.get(ConfigReader.getValue(Constants.URL));
		//Drop Down
		Select select = new Select(driver.findElement(By.id("selecttype")));
		//select.selectByIndex(0);
		//select.selectByVisibleText("Selenium IDE");
		//select.selectByValue("se");
		//twotabsearchtextbox
		WebElement element  = driver.findElement(By.id("twotabsearchtextbox"));
		//boolean result = element.isDisplayed();
		//result = element.isEnabled();
		Point point = element.getLocation();
		System.out.println(point.getX()+" "+point.getY());
		element.sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Get It by Tomorrow")).click();
		Thread.sleep(5000); // 5 sec
		driver.close();
		//driver.quit();
		

	}

}
