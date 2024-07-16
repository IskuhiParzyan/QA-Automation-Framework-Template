package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    By avatarIcon = By.cssSelector("img.avatar");
    By currentPasswordField = By.cssSelector("[name=current_password]");
    By nameField = By.cssSelector("#inputProfileName");
    By currentEmailField = By.cssSelector("#inputProfileEmail");
    By saveBtn = By.cssSelector(".btn-submit");
    By actualProfileName= By.cssSelector("a.view-profile>span");


    // HELPER METHODS
    public void clickOnAvatarIcon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(avatarIcon)).click();

    }

    public void enterCurrentPassword(String Password) {
        findElement(currentPasswordField).sendKeys(Password);
    }

    public void enterNewUserName(String userName) {
        WebElement element = findElement(nameField);
        element.clear();
        element.sendKeys(userName);

    }

    public void enterCurrentEmail(String email) {
        findElement(currentEmailField).sendKeys(email);
    }

    public void clickOnSave() {
        findElement(saveBtn).click();
    }


}