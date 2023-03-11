package online.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_19_Java_Scipt {

	public static void main(String[] args) {

		/// Launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel.ACS\\Desktop\\Translatation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.in");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// enter text in search box
		js.executeScript("document.getElementById('Search_Data').value='Aliya';");

		// click on find button
		WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));
		js.executeScript("arguments[0].click();", element);

		// to refresh browser
		js.executeScript("history.go(0)");

		// get domain name
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain:" + domain);

		// get title name
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title:" + title);

		// draw broder around web element
		js.executeScript("arguments[0].style.border = '3px solid red';", element);

		// zoom 50%
		js.executeScript("document.body.style.zoom='50%'");

		// Return height and width of web page
		// System.out.println(js.executeScript("return
		// window.innerHeight;").toString());
		// System.out.println(js.executeScript("return window.innerWidth;").toString())

		// scroll vertically till the end
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// scroll vertically page up
		// js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		// js.executeScript("alert('This is my alert message.');");

		// js.executeScript("window.location = 'http://www.google.com'");

		// flash
		// String bgcolor = element.getCssValue("backgroundColor");
		// for (int i = 0; i < 20; i++)
		// {
		// js.executeScript("arguments[0].style.backgroundColor ='#000000'",
		// element);//black
		//
		// try {
		// Thread.sleep(80);//20 ms
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		//
		// js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'",
		// element);
		//
		// try {
		// Thread.sleep(80);//20 ms
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }

	}

}
