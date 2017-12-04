package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSteps {

    public static WebDriver driver;


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page(){
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","D:\\Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.linkedin.com");
    }

    @When("^User enters UserName$")
    public void user_enters_UserName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("login-email")).sendKeys("username");
    }

    @When("^User enters Password$")
    public void user_enters_Password() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("login-password")).sendKeys("password");
        driver.findElement(By.id("login-submit")).click();
    }

    @Then("^User is logged in successfully$")
    public void user_is_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        String username = driver.findElement(By.xpath(".//*[@id='voyager-feed']/div[2]/aside[1]/div/div/div/div[1]/a[2]")).getText();

        Assert.assertEquals(username, "Sergio Gonzalez");
        driver.quit();
    }
}
