package StepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import DataProviders.BaseClass;
import DataProviders.PojoClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps extends BaseClass {

	@Given("go to the website")
	public void go_to_the_website() {

		lanchBrowser();
		url("https://www.amazon.in/");
		max();
	}

	@Then("search for the product")
	public void search_for_the_product() throws InterruptedException {

		 PojoClass p = new PojoClass();

		passvalue(p.searchbox,"boat smart watch");
		Click(p.searchbutton);
		

	}

	@Then("select the product")
	public void select_the_product() throws InterruptedException {
	   scrolldown(p.prod);
		Thread.sleep(5000);
		Click(p.prod);
	}

	@Then("select the quatity")
	public void select_the_quatity() throws InterruptedException {
		switchwin();
	}

	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
	    scrolldown(p.cart);
	    Click(p.cart);
	    Thread.sleep(19000);
	   switchwin();
	    
	    Click(p.prod);
	}

}
