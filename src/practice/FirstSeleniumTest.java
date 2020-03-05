package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String applicationURL = "http://batch4html.s3-website-us-east-1.amazonaws.com/";
		
		try {
			System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(applicationURL);
			
			String currentURL = driver.getCurrentUrl();
			
			if (currentURL.equals(applicationURL)) { 
				System.out.println("Test Passed: URL matches!");
			} else {
				System.out.println("Test Failed:");
				System.out.println("Expected URL: " + applicationURL);
				System.out.println("Actual URL: "+ currentURL);
			}
			
			driver.findElement(By.name("firstName")).sendKeys("Aidana");
			driver.findElement(By.name("lastName")).sendKeys("Ok");
			driver.findElement(By.id("gender-2")).click();
			driver.findElement(By.name("dob")).sendKeys("12/21/2002");
			
			Select locationDropdown = new Select(driver.findElement(By.tagName("select")));
			locationDropdown.selectByIndex(2);
	
			driver.findElement(By.name("phonenumber")).sendKeys("202-202-2000");	
			driver.findElement(By.name("email")).sendKeys("aidana@gmail.com");
			
			driver.findElement(By.name("bio")).sendKeys("I ask questions!");
			
			driver.findElement(By.name("student")).click();
			driver.findElement(By.name("looking")).click();
			driver.findElement(By.name("working")).click();
			
			driver.findElement(By.name("socialmedia")).sendKeys("https://facebook.com/aidana");
			
			driver.findElement(By.name("username")).sendKeys("Aidana2002");
			driver.findElement(By.name("password")).sendKeys("Aidana2002");
			driver.findElement(By.name("password2")).sendKeys("Aidana2002");
			
			driver.findElement(By.name("notrobot")).click();
			
			driver.switchTo().alert().accept();
			
			waitFor(1);
			
			driver.findElement(By.name("submit")).click();
			
			waitFor(3);
			
			String submitURL = driver.getCurrentUrl();
			System.out.println(submitURL);
			
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
		}
	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;')", element);
	}

}

	


