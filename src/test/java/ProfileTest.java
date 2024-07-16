import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest{
    @Test
    public void changeUserName() throws InterruptedException {

        LoginPage loginPage=new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        ProfilePage profilePage=new ProfilePage(driver);

        loginPage.enterEmail("iparzyan@gmail.com");
        loginPage.enterPassword("MkoIkaMarkMia-789");
        loginPage.clickSubmit();
        Thread.sleep(2000);

        profilePage.clickOnAvatarIcon();
        Thread.sleep(3000);

        profilePage.enterCurrentPassword("MkoIkaMarkMia-789");
        Thread.sleep(2000);
        profilePage.enterNewUserName("Aleksander Kostanyan");
        profilePage.enterCurrentEmail("iparzyan@gmail.com");
        profilePage.clickOnSave();
        //Expected Result . assertion





    }

}
