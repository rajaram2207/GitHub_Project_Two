package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.baseclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rajaram\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\feature\\Facebook.feature",
glue="com.stepdefinition")

public class Runner {
	public static WebDriver driver;
@org.junit.BeforeClass
public static void setup() {
	driver=Baseclass.browser("chrome");
		
		}


}
