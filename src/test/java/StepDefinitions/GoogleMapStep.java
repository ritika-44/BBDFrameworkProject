package StepDefinitions;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleMapStep {
    WebDriver driver = Hooks.driver;

    @Given("user is on google map")
    public void user_is_on_google_map() {
        driver.get("https://www.google.com/maps");

    }

    @When("user enter the {string}")
    public void user_enter_the(String location1) {
        driver.findElement(By.id("searchboxinput")).sendKeys(location1,Keys.ENTER);

    }

    @And("user enter {string} and click on search")
    public void user_enter_and_click_on_search(String location2) {
        driver.findElement(By.xpath("//button[@data-value=\"Directions\"]")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Choose starting point')]")).sendKeys(location2, Keys.ENTER);

    }

    @Then("verify the direction are displayed")
    public void verify_the_direction_are_displayed() {
        int size=driver.findElements(By.xpath("//div[contains(@id,'section-directions-trip')]")).size();
        Assert.assertTrue("More than 1 route not  found",size>=1);
        System.out.println("Verified there are more than one rute found");
    }

}
