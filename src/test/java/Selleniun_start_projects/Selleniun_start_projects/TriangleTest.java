package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

	static WebDriver browser;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOGOMORI\\Desktop\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
	}

	@Test
	public void testTriangleType() {
		browser.findElement(By.id("side1")).sendKeys("3");
		browser.findElement(By.id("side2")).sendKeys("3");
		browser.findElement(By.id("side3")).sendKeys("3");
		WebElement checkButton = browser.findElement(By.id("identify-triangle-action"));
		checkButton.click();
		WebElement resultElement = browser.findElement(By.id("triangle-type"));
		String actualResult = resultElement.getText();

		String expectedResult = "Equilateral";
		assertEquals(expectedResult, actualResult);
		System.out.println("Triangle Type1: " + actualResult);
	}
	@Test
	public void testTriangleType2() {
		browser.findElement(By.id("side1")).sendKeys("1");
		browser.findElement(By.id("side2")).sendKeys("2");
		browser.findElement(By.id("side3")).sendKeys("1");
		WebElement checkButton = browser.findElement(By.id("identify-triangle-action"));
		checkButton.click();
		WebElement resultElement = browser.findElement(By.id("triangle-type"));
		String actualResult = resultElement.getText();

		String expectedResult = "Error: Not a Triangle";
		assertEquals(expectedResult, actualResult);
		System.out.println("Triangle Type2: " + actualResult);
	}
	@Test
	public void testTriangleType3() {
		browser.findElement(By.id("side1")).sendKeys("4");
		browser.findElement(By.id("side2")).sendKeys("4");
		browser.findElement(By.id("side3")).sendKeys("2");
		WebElement checkButton = browser.findElement(By.id("identify-triangle-action"));
		checkButton.click();
		WebElement resultElement = browser.findElement(By.id("triangle-type"));
		String actualResult = resultElement.getText();

		String expectedResult = "Isosceles";
		assertEquals(expectedResult, actualResult);
		System.out.println("Triangle Type3: " + actualResult);
	}
	@Test
	public void testTriangleType4() {
		browser.findElement(By.id("side1")).sendKeys("5");
		browser.findElement(By.id("side2")).sendKeys("4");
		browser.findElement(By.id("side3")).sendKeys("3");
		WebElement checkButton = browser.findElement(By.id("identify-triangle-action"));
		checkButton.click();
		WebElement resultElement = browser.findElement(By.id("triangle-type"));
		String actualResult = resultElement.getText();

		String expectedResult = "Scalene";
		assertEquals(expectedResult, actualResult);
		System.out.println("Triangle Type4: " + actualResult);
	}
	
}
