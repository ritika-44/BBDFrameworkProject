package StepDefinitions;

import Hooks.Hooks;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Hooks.Hooks.driver;

public class LoginPagePOM {
   protected LoginPage loginPage = new LoginPage(driver);

    @Given("user is login page")
    public void user_is_login_page() {
        driver.get("https://practice.expandtesting.com/login");
        System.out.println("Running from page object  module ");
    }


    @When("user enters  {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.enterUsername_and_password(username,password);

    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        loginPage.homePageIsDisplayed();




    }
}
