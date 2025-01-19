package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;

public class AppTest {

	static WebDriver browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOGOMORI\\Desktop\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");

	}

	@Test
	public void Tests1() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("1234567");
		browser.findElement(By.name("validate")).click();

		WebElement resultElement = browser.findElement(By.name("validation_message"));
		String actual_result = resultElement.getAttribute("value");
		
		String expected_result = "Valid Value";
		assertEquals(expected_result, actual_result);
		System.out.println("Tests 1 = "+" "+actual_result);
		
		
	}
	@Test
	public void Tests2() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("");
		browser.findElement(By.name("validate")).click();

		WebElement resultElement = browser.findElement(By.name("validation_message"));
		String actual_result = resultElement.getAttribute("value");
		
		String expected_result = "Invalid Value";
		assertEquals(expected_result, actual_result);
		System.out.println("Tests 2 = "+" "+actual_result);
	}
	@Test
	public void Tests3() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("aB1cD2E");
		browser.findElement(By.name("validate")).click();

		WebElement resultElement = browser.findElement(By.name("validation_message"));
		String actual_result = resultElement.getAttribute("value");
		
		String expected_result = "Valid Value";
		assertEquals(expected_result, actual_result);
		System.out.println("Tests 3 = "+" "+actual_result);
	}
	@Test
	public void Tests4() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("aBcD1!2");
		browser.findElement(By.name("validate")).click();

		WebElement resultElement = browser.findElement(By.name("validation_message"));
		String actual_result = resultElement.getAttribute("value");
		
		String expected_result = "Invalid Value";
		assertEquals(expected_result, actual_result);
		System.out.println("Tests4= "+" "+actual_result);
	}
	
	

}