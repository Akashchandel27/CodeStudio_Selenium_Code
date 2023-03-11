 package online.Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_25_Authentication_Popup {

	public static void main(String[] args) {
		

		// Launch chrome browser 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel.ACS\\Desktop\\Translatation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise browser's
		driver.manage().window().maximize();

		// open url:- user id and password in the URL in the application
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
