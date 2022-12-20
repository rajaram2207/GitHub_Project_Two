package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver browser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				// System.setProperty("webdriver.chrome.driver",
				// System.getProperty("user.dir") + ("\\driversss\\chromedriver.exe"));

				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				// System.setProperty("webdriver.ie.driver",
				// System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();

			} else if (browserName.equalsIgnoreCase("firefox")) {
				// System.setProperty("webdriver.gecko.driver",
				// System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				WebDriverManager.firefoxdriver().setup();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void close() {
		driver.close();

	}

	public static void quite() {
		driver.quit();
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void enabled(WebElement element) {
		element.isEnabled();
	}

	public static void displayed(WebElement element) {
		element.isDisplayed();
	}

	public static void selected(WebElement element) {
		element.isSelected();
	}

	public static void screenshot(String filename) throws IOException {
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timetamp = time.toString().replace(":", " ").replace(" ", "");
		System.out.println(time);
		System.out.println(timetamp);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinateFile = new File(System.getProperty("screenshot.dir") + "\\screenshot" + filename + ".png");
		FileUtils.copyFileToDirectory(sourceFile, destinateFile);

	}

	public static void selection(WebElement element, String Option, String value) {
		Select sc = new Select(element);

		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void sendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearOnElement(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void simpleAlert() {
		driver.switchTo().alert().accept();

	}

	public static void confirmAlert(String ok, String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();

		} else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();

		}
	}
}


