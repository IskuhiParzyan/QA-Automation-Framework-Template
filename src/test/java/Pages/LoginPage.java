package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;



//Page object Model design pattern


public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) {

        super(givenDriver);
    }

    //LOCATORS
    By emailField = By.cssSelector("[type='email']");
    By passwordField = By.cssSelector("[type='password']");
    By submitBtn = By.cssSelector("[type='submit']");

    // POM Helper Methods

    public void enterEmail(String email) {

        findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        findElement(submitBtn).click();

    }

    // for POM we are providing credentials
    public void login() {
        enterEmail("iparzyan@gmail.com");
        enterPassword("MkoIkaMarkMia-789");
        clickSubmit();
    }







//other design

 /*   public static WebElement enterEmailAddress(WebDriver driver){
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        return emailField;
      //  emailField.click();
      //  emailField.clear();
       // emailField.sendKeys(email);
      //  Thread.sleep(3000);
    }
    public static WebElement enterPassword(WebDriver driver){
        WebElement passwordField=driver.findElement(By.cssSelector("[type='password']"));
        return passwordField;

      // passwordField.click();
        //passwordField.clear();
       // passwordField.sendKeys(password);
    }
  public static WebElement clickSubmit(WebDriver driver){
        WebElement submitBtn=driver.findElement(By.cssSelector("[type='submit']"));
        return submitBtn;

       // submitBtn.click();
    }

    private WebElement driver;
    WebElement avatarDisplayed = driver.findElement(By.cssSelector("img[class='avatar']"));
*/

}
