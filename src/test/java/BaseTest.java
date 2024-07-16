import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.time.Duration;

import static java.lang.Thread.*;

public class BaseTest {
    public static WebDriver driver = null;
    public static WebElement element = null;
   public WebDriverWait wait;
public Actions actions;




    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    @Parameters({"BaseUrl"})
    @Test
    public void launchBrowser(String BaseUrl) {
        //      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
// initializing WebDriver
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(BaseUrl);
        wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        navigateToLoginPage(BaseUrl);

    }
    //GO to the Koel
    public void navigateToLoginPage(String BaseUrl){
        driver.get(BaseUrl);
    }

    // login with valid credentials
    /*
    @Test
    public static void provideEmail(){
        WebElement emailField= driver.findElement(By.cssSelector("[type='email']"));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("iparzyan@gmail.com");
    }
    public static void providePassword(){
        WebElement passwordField= driver.findElement(By.cssSelector("[type='password']"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("MkoIkaMarkMia-789");
    }
    public static void submitBtn(){
        WebElement submitBtn=driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();
    }
*/
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}