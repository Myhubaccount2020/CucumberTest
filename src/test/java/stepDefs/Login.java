package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("User is on facebook login page")
    public void userIsOnFacebookLoginPage() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().equals("Facebook - Log In or Sign Up"));

    }

    @And("User login with username,password")
    public void userLoginWithUsernamePassword() {
     driver.findElement(By.id("email")).sendKeys("mouradusertest");
     driver.findElement(By.id("pass")).sendKeys("pwdtest");
     driver.findElement(By.name("login")).click();
        
    }

    @Then("User should see an error message")
    public void userShouldSeeAnErrorMessage() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='The email or phone number you’ve entered doesn’t match any account. ']")).isDisplayed());

    }
}
