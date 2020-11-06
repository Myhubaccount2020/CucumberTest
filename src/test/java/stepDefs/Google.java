package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    WebDriver driver;
    @Given("user is on google web page")
    public void userIsOnGoogleWebPage() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @And("user navigate to the {string}")
    public void userNavigateToThe(String link) {
        driver.findElement(By.linkText(link)).click();


    }

    @Then("the title of the page contains {string}")
    public void theTitleOfThePageContains(String title) {
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    @Given("I am on the {string} URL")
    public void iAmOnTheURL(String arg0) {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();



    }

    @And("the page title should contains {string}")
    public void thePageTitleShouldContains(String arg0) {

        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Then("I navigate to the {string} link")
    public void iNavigateToTheLink(String arg0) {
        driver.findElement(By.linkText("Advertising")).click();

    }


}
