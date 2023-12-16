package com.goldfish.datastar.selenium.testing.localhost.findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;

public class ByLinkTextTest extends GoldfishDatastarAbstractChromeWebDriverTestNgTest {

	@Test
	public void getDashboardHomeLinkAndClickIt() {
		driver.get("http://localhost:8080/login");
		WebElement link = driver.findElement(By.linkText("Dashboard Home"));
		System.out.println(link.getAttribute("href"));// http://localhost:8080/pages/login.html
		link.click();
		System.out.println(driver.getCurrentUrl());// http://localhost:8080/pages/login.html
	}

	@Test
	public void getTableLinkAndClickIt() {
		driver.get("http://localhost:8080/pages/index.html");
		WebElement link = driver.findElement(By.linkText("Tables"));
		System.out.println(link.getAttribute("href"));
		link.click();
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void getSBAdminLinkAndClickIt() {
		driver.get("http://localhost:8080/pages/index.html");
		WebElement link = driver.findElement(By.partialLinkText("SB Admin"));
		System.out.println(link.getAttribute("href"));
		link.click();
		System.out.println(driver.getCurrentUrl());
	}

}
