package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav-cart-count")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11 case");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/h2/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit(); }
	}


