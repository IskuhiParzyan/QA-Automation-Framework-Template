package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
  private static WebElement element=null;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    //LOCATORS

    By userAvatarIcon= By.cssSelector("img.avatar");


    //HELPER METHOD
    public WebElement getAvatarIcon(){
        return findElement(userAvatarIcon);

    }



    /*
    public static WebElement textbox_search(WebElement driver ){
       element= driver.findElement(By.name("q"));
      return element;

   }
*/

}
