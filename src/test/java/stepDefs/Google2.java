package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {
    WebDriver driver;
    @Given("User is on the google page")
    public void userIsOnTheGooglePage() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @And("User should go to the advertising link")
    public void userShouldGoToTheAdvertisingLink() {
        driver.findElement(By.linkText("Advertising")).click();
    }

    @Then("User should see the Advertising page")
    public void userShouldSeeTheAdvertisingPage() {
        Assert.assertTrue(driver.getTitle().contains("Advertising"));
    }

    @Given("User navigates to {string}")
    public void userNavigatesTo(String URL) {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @Then("The title of the page contains {string}")
    public void theTitleOfThePageContains(String title) {
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    @And("User clicks on {string} link")
    public void userClicksOnLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }
}
