package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpage {
	public static WebDriver driver;
	@FindBy (xpath = "//input[@type='text']")
	private WebElement username;


	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;

	public Fbpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy (xpath ="//button[@value='1']" )
	private WebElement login;
}
