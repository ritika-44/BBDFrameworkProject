package Pages;

import Hooks.Hooks;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Hooks.Hooks.driver;

public class LoginPage {
    WebDriver driver ;
    By txt_username=By.id("username");
    By txt_password = By.id("password");
    By btn_login = By.xpath("//button[text()='Login']");
    By home_page = By.xpath("//h1[text()='Secure Area page for Automation Testing Practice']");

    public LoginPage(WebDriver driver){

        this.driver=driver;
    }

    public void enterUsername_and_password(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {
        //cast webdriver object to javascript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[1,0].click();",driver.findElement(btn_login),driver.findElement(btn_login));

    }
    public void homePageIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            // Wait for alert if it's present
            wait.until(ExpectedConditions.alertIsPresent());
            Thread.sleep(2000);
            Alert alert = driver .switchTo().alert();
            //System.out.println(alert.getText());
            alert.accept();
        } catch (TimeoutException | InterruptedException e) {
            System.out.println("No alert present.");
        };
        driver.findElement(home_page).isDisplayed();

    }
}
