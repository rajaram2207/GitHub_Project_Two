package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Baseclass;
import com.pom.Fbpage;
import com.pom.FirstPAge;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass  {
	FirstPAge c=new FirstPAge(driver);
	
	

	@Given("User  Enter a url")
	public void user_enter_a_url() {
	   getUrl("https://www.facebook.com/");
	}
	@When("User Want To Click create new account button")
	public void user_want_to_click_create_new_account_button() {
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	   
	}
	@When("User sign up with following details")
	public void user_sign_up_with_following_details(io.cucumber.datatable.DataTable dataTable)  {
	  List<List<String>> obj = dataTable.asLists();
	  
		sendkeys(c.getFirstname(), obj.get(0).get(0));
	}


}
