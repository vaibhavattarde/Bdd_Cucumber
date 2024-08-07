package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStepDefination {
    WebDriver driver;
    @Given("Browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://adactinhotelapp.com/");
    }

    @And("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on login page");
    }

    @When("^User enter the (.*) and (.*)$")
    public void user_enter_the_Username_and_Password(String Username , String Password) {
        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);

    }

    @When("Click on the login button")
    public void click_on_the_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @And("User Navigated to the home page")
    public void user_navigated_to_the_home_page() {
        System.out.println("Navigate");
    }

}
