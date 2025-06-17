package StepDefinitions;

import Hooks.Hooks;
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

public class LoginPageStep {
//    WebDriver driver = Hooks.driver;
//
//    @Given("user is login page")
//    public void user_is_login_page() {
//        driver.get("https://practice.expandtesting.com/login");
//    }
//
//    @When("user enters  {string} and {string}")
//    public void user_enters_and(String username, String password) {
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//
//    }
//
//    @And("clicks on login button")
//    public void clicks_on_login_button() {
//        driver.findElement(By.xpath("//button[text()='Login']")).click();
//    }
//
//    @Then("user is navigated to home page")
//    public void user_is_navigated_to_home_page() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        try {
//            // Wait for alert if it's present
//             wait.until(ExpectedConditions.alertIsPresent());
//            Thread.sleep(2000);
//            Alert alert = driver .switchTo().alert();
//            //System.out.println(alert.getText());
//            alert.accept();
//        } catch (TimeoutException | InterruptedException e) {
//            System.out.println("No alert present.");
//        };
//        driver.findElement(By.xpath("//h1[text()='Secure Area page for Automation Testing Practice']")).isDisplayed();
//
//
//
//    }
}
