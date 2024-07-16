import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import Pages.LoginPage;


public class LoginTests extends BaseTest {
    @Test
    public void loginValidCredentials() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        HomePage homePage= new HomePage(driver);

        loginPage.enterEmail("iparzyan@gmail.com");
        Thread.sleep(2000);
        loginPage.enterPassword("MkoIkaMarkMia-789");
        Thread.sleep(2000);
        loginPage.clickSubmit();

        //Expected Result
        Assert.assertTrue(homePage.getAvatarIcon().isDisplayed());

    }



/*
    @Test(priority = 0)
    public static void koelLogin() {

    // go to koel page
        driver.get("BaseUrl");
        LoginPage.enterEmailAddress(driver).click();
        LoginPage.enterEmailAddress(driver).sendKeys("iparzyan@gmail.com");
        LoginPage.enterPassword(driver).click();
        LoginPage.enterPassword(driver).sendKeys("MkoIkaMarkMia-789");
        LoginPage.clickSubmit( driver).click();

    }
 */
    }

