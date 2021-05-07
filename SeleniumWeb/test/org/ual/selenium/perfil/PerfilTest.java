package org.ual.selenium.perfil;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class PerfilTest {
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
	public void perfilcorrecto() {
		// Test name: Perfil_correcto
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Edit profile | 
		driver.findElement(By.linkText("Edit profile")).click();
		// 18 | click | id=full-name | 
		driver.findElement(By.id("full-name")).click();
		// 19 | type | id=full-name | nombre
		driver.findElement(By.id("full-name")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.id("full-name")).sendKeys("nombre");
		// 20 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 21 | assertText | css=.row:nth-child(4) strong | nombre
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit profile")));
		}
		assertThat(driver.findElement(By.cssSelector(".row:nth-child(4) strong")).getText(), is("nombre"));
		// 22 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 23 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
	@Test
	public void perfilcorreoincompleto1() {
		// Test name: Perfil_correo_incompleto1
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Edit profile | 
		driver.findElement(By.linkText("Edit profile")).click();
		// 18 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 19 | type | id=email-address | ual@a
		driver.findElement(By.id("email-address")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.id("email-address")).sendKeys("ual@a");
		// 20 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 21 | assertText | css=.invalid-feedback | Please enter a valid email address.
		assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Please enter a valid email address."));
		// 22 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 23 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
	@Test
	public void perfilcorreoincompleto2() {
		// Test name: Perfil_correo_incompleto2
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Edit profile | 
		driver.findElement(By.linkText("Edit profile")).click();
		// 18 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 19 | type | id=email-address | ual@algo.
		driver.findElement(By.id("email-address")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.id("email-address")).sendKeys("ual@algo.");
		// 20 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 21 | executeScript | return document.getElementById("email-address").validationMessage | message
		vars.put("message", js.executeScript("return document.getElementById(\"email-address\").validationMessage"));
		// 22 | echo | ${message} | 
		System.out.println(vars.get("message").toString());
		// 23 | assert | message | El signo "." está colocado en una posición incorrecta en la dirección "algo.".
		assertEquals(vars.get("message").toString(), "Please enter an email address.");
		// 24 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 25 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
	@Test
	public void perfilcorreosinarroba() {
		// Test name: Perfil_correo_sin_arroba
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Edit profile | 
		driver.findElement(By.linkText("Edit profile")).click();
		// 18 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 19 | type | id=email-address | ual
		driver.findElement(By.id("email-address")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		driver.findElement(By.id("email-address")).sendKeys("ual");
		// 20 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 21 | executeScript | return document.getElementById("email-address").validationMessage | message
		vars.put("message", js.executeScript("return document.getElementById(\"email-address\").validationMessage"));
		// 22 | echo | ${message} | 
		System.out.println(vars.get("message").toString());
		// 23 | assert | message | Incluye un signo "@" en la dirección de correo electrónico. La dirección "ual" no incluye el signo "@".
		assertEquals(vars.get("message").toString(), "Please enter an email address.");
		// 24 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 25 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
}
