package com.raghib.amazon;

/**
 * REFERENCES:-
 * https://www.youtube.com/watch?v=V_jUoJIX1jQ
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.raghib.selenium.BaseClass;

public class BrowserIncognitoMode extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";

	public static String url = "https://www.amazon.in";

	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("mobile");
		element.submit();
		Thread.sleep(5000);
		BaseClass.quitDriver();
	}
}
