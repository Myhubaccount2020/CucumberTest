import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    WebDriver driver;
    @Given("User log in to the amazon web site")
    public void userLogInToTheAmazonWebSite() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/"));
        driver.findElement(By.id("nav-link-accountList")).click();
        WebElement emailPhoneNum = driver.findElement(By.id("ap_email"));
        emailPhoneNum.sendKeys("mouradikhlef1979@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        WebElement Password = driver.findElement(By.id("ap_password"));
        Password.sendKeys("validpassword");
        driver.findElement(By.id("signInSubmit")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Hello, mourad']")).isDisplayed());

    }

    @Then("Navigate")
    public void navigate() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.sendKeys("dell computers");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("dell computers"));
        driver.findElement(By.id("nav-orders")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("order-history"));
        driver.navigate().back();

    }


}
