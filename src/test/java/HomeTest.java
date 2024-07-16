import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

/*
public class HomeTest extends BaseTest{
// Tests start here
    @Test
    public void playSongWithContextClick() throws InterruptedException {
        //login
      provideEmail();
      providePassword();
      submitBtn();
        //choose all songs section
        Thread.sleep(10000);
        chooseAllSongsList();
        Thread.sleep(5000);
        //Right click on any song
        contextClick();
        Thread.sleep(5000);
        // choose play
        choosePLayOption();

        //assertion
        //tests end here
        }
        @Test
        public void hoverOverPlayBtn(){
        //login
            provideEmail();
            providePassword();
            submitBtn();

         // hoverOver
            // Assertion
        }
        public WebElement hoverPlay(){
        WebElement playBtn= driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        actions.moveToElement(playBtn).perform();
        return wait.until(ExpectedConditions.visibilityOf(playBtn));
        }
        //helper methods start here
        public void  chooseAllSongsList(){
        WebElement allSongsList= driver.findElement(By.cssSelector("li a.songs"));
        allSongsList.click();
           // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector())).click();
        }

         public void contextClick(){
        WebElement firstSong= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".all-songs tr.song-item:nth-child(1)")));
        actions.contextClick(firstSong).perform();

         }
         public void choosePLayOption(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.playback"))).click();
         }
        //helper methods end here
}
*/
