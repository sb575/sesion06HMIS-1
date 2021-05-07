package org.ual.selenium.hmis;

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
public class PrincipalTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {

		// Browser selector 
		String browser = "";
		Boolean headless = true;
		browser = System.getProperty("browserProperty");

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
	public void paginaprincipal() {
		// Test name: pagina_principal
		// Step # | name | target | value
		// 1 | open | https://hmis21-drs600.azurewebsites.net/ | 
		driver.get("https://hmis21-drs600.azurewebsites.net/");
		// 2 | setWindowSize | 1250x809 | 
		driver.manage().window().setSize(new Dimension(1250, 809));
		// 3 | assertText | css=.masthead-heading | GALVEZROSENOVBAOUCH
		assertThat(driver.findElement(By.cssSelector(".masthead-heading")).getText(), is("GALVEZROSENOVBAOUCH"));
		// 4 | assertText | css=.list-group-item:nth-child(1) | Repositorio de este proyecto: Pincha Aqui
		assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("Repositorio de este proyecto: Pincha Aqui"));
		// 5 | assertText | css=.list-group-item:nth-child(2) | Documentación GitHub: Pincha Aqui
		assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("Documentación GitHub: Pincha Aqui"));
		// 6 | assertText | css=.list-group-item:nth-child(3) | Organización HMIS: Pincha Aqui
		assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("Organización HMIS: Pincha Aqui"));
		// 7 | assertText | css=.list-group-item:nth-child(4) | Git Book: Pincha Aqui
		assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(4)")).getText(), is("Git Book: Pincha Aqui"));
		// 8 | assertText | css=.list-group-item:nth-child(5) | Azure Portal: Pincha Aqui
		assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(5)")).getText(), is("Azure Portal: Pincha Aqui"));
		// 9 | assertText | css=.list-group-item:nth-child(6) | Documentación Azure: Pincha Aqui
		assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(6)")).getText(), is("Documentación Azure: Pincha Aqui"));
		// 10 | assertText | css=.mx-auto > .page-section-heading | ENLACES A RECURSOS
		assertThat(driver.findElement(By.cssSelector(".mx-auto > .page-section-heading")).getText(), is("ENLACES A RECURSOS"));
		// 11 | click | css=.list-group-item:nth-child(2) > a | 
		driver.findElement(By.cssSelector(".list-group-item:nth-child(2) > a")).click();
	}
}
