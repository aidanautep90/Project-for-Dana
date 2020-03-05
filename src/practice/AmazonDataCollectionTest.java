package practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDataCollectionTest {
	public static WebDriver driver;
	public static void main(String[] args) {
	try {
		System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");

		WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
		Integer itemCount = Integer.valueOf(cartCount.getText());
		
		if (itemCount == 0) {
			System.out.println("Test Case Status: Pass");
		} else {
			System.out.println("Test Case Status: Fail");
			System.out.println("Expected ItemCount: " + 0);
			System.out.println("Actual ItemCount: " + itemCount);
		}
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("iPhone Case");
		searchBar.submit();
		
		List <WebElement> searchResults = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
//		System.out.println("There are " + searchResults.size() + " results on the page!");
		
		searchResults.get(0).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		// TODO: There are 2 scenarios here
		// attach-sidesheet-view-cart-button
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		
	
		
		cartCount = driver.findElement(By.id("nav-cart-count"));
		itemCount = Integer.valueOf(cartCount.getText());
		
		if (itemCount == 1) {
			System.out.println("Test Case Status: Pass");
		} else {
			System.out.println("Test Case Status: Fail");
			System.out.println("Expected ItemCount: " + 0);
			System.out.println("Actual ItemCount: " + itemCount);
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		driver.close();
		driver.quit();
	}
	}

}
