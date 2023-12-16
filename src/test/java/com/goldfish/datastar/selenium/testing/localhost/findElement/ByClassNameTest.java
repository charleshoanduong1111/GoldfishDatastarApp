package com.goldfish.datastar.selenium.testing.localhost.findElement;

import static org.testng.AssertJUnit.assertEquals;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;

public class ByClassNameTest extends GoldfishDatastarAbstractChromeWebDriverTestNgTest {

	@Test
	public void testTitleTextElement() {
		driver.get("http://localhost:8080/pages/index.html");
		WebElement title = driver.findElement(By.className("navbar-brand"));
		assertEquals(title.getText(), "SB Admin v2.0");
	}

	@Test
	public void testHugeTextElements() {
		driver.get("http://localhost:8080/pages/index.html");
		List<WebElement> hugeElements = driver.findElements(By.className("huge"));
		for (WebElement element : hugeElements) {
			System.out.println(element.getText());
		}

	}

}
