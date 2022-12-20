package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPAge {
	public static WebDriver driver;
	

	public FirstPAge(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	
	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignin() {
		return signin;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement surname;

	@FindBy(xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement mobile;

	@FindBy(xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")
	private WebElement password;

	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement date;

	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@name='birthday_year']")
	private WebElement year;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement gender;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement signin;
}
