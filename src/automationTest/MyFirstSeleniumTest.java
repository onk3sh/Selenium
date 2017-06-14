/**
 * 
 */
package automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author obansal
 * 
 * Opening the google home page using mozilla driver
 *
 */
public class MyFirstSeleniumTest {

	/**
	 * Launching Mozilla browser with Google page
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
