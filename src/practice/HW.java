package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HW {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		try {
	
		System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.costco.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("navigation-dropdown"))).perform();
		waitFor(1);
		action.moveToElement(driver.findElement(By.id("30004"))).build().perform();
		waitFor(1);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='level2-all-departments']/li[@id='30113']"))).perform();
		waitFor(1);
		driver.findElement(By.id("577609")).click();
		waitFor(1);
		
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		driver.close();
		driver.quit();
		
	}
		
	}
	public static void waitFor (int seconds) {	
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
}
