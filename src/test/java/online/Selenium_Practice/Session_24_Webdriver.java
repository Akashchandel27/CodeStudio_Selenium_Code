package online.Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_24_Webdriver {

	public static void main(String[] args) {
		// Launch chrome driver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		// we can open chrome, firefox, IE by changing the name

	}

}
