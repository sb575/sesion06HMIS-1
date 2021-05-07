package org.ual.selenium.login;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {

		// Browser selector 
		String browser = "";
		Boolean headless = true;
		browser = "firefox";
		System.out.print("\n\n\n\n"+browser);

		switch (browser) {
		case "firefox":  // firefox
			// Firefox 
			// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
			// Descomprimir el archivo geckodriver.exe en la carpeta drivers

			//System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			if (headless) firefoxOptions.setHeadless(headless);
			driver = new FirefoxDriver(firefoxOptions);

			break;
		case "chrome": // chrome
			// Chrome
			// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
			// Descomprimir el archivo chromedriver.exe en la carpeta drivers

			//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			if (headless) chromeOptions.setHeadless(headless);
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);

			break;

		default:
			fail("Please select a browser");
			break;
		}
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void loginCorrecto() {
		// Test name: LoginCorrecto
		// Step # | name | target | value
		// 1 | open | / | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/");
		// 2 | setWindowSize | 699x738 | 
		driver.manage().window().setSize(new Dimension(699, 738));
		// 3 | click | linkText=Log in | 
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control | 
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control | galvezRosenovBaouch@ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("galvezRosenovBaouch@ual.es");
		// 6 | click | css=.form-group:nth-child(2) > .form-control | 
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		// 7 | type | css=.form-group:nth-child(2) > .form-control | grb12344321
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("grb12344321");
		// 8 | click | css=.ajax-button | 
		driver.findElement(By.cssSelector(".ajax-button")).click();
	}
	@Test
	public void loginIncorrecto() {
		// Test name: LoginIncorrecto
		// Step # | name | target | value
		// 1 | open | / | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/");
		// 2 | setWindowSize | 699x738 | 
		driver.manage().window().setSize(new Dimension(699, 738));
		// 3 | click | linkText=Log in | 
		driver.findElement(By.linkText("Log in")).click();
		// 4 | type | css=.form-group:nth-child(1) > .form-control | galvezRosenov@ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("galvezRosenov@ual.es");
		// 5 | click | css=.form-group:nth-child(2) > .form-control | 
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
		// 6 | type | css=.form-group:nth-child(2) > .form-control | grb12344321
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("grb12344321");
		// 7 | click | css=.ajax-button | 
		driver.findElement(By.cssSelector(".ajax-button")).click();
	}
}
