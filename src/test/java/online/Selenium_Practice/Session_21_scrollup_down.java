package online.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_21_scrollup_down {

	public static void main(String[] args) {

		/// Launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel.ACS\\Desktop\\Translatation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// open url
		driver.get("http://www.album.alexflueras.ro/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Scroll vertically down by 500 pixels
		// js.executeScript("window.scrollBy(0,1000)");

		// scroll till visibilty of web element
		// WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		// js.executeScript("arguments[0].scrollIntoView();",element );

		// To scroll down the web page at the bottom of the page
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// Horizontal scroll on the web page
		WebElement Element = driver.findElement(By.id("a7"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

}
