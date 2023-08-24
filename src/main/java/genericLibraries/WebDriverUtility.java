package genericLibraries;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility {
	
	private WebDriver driver;
	
	public void navigateToApp(String browser, String url, long time) {
		switch(browser) {
		case"chrome":
			driver = new ChromeDriver();
		case"firefox":
			driver = new FirefoxDriver();
		case"edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser info");
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		

}
