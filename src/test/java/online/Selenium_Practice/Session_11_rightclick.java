package online.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session_11_rightclick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel.ACS\\Desktop\\Translatation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions act = new Actions(driver);
		act.contextClick(button).perform(); // right click

	}

}
