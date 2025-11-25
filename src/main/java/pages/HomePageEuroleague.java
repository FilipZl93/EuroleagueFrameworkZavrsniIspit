package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;

public class HomePageEuroleague extends BasePage {

//    -KONSTRUKTOR:

    public HomePageEuroleague(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    -LOKATORI:


    private By euroleagueLogo = By.xpath("(//*[text()=\"Euroleague\"]) [3]");

    private By news = By.xpath("(//*[text()=\"News\"])[3]");
    private By gameCenter = By.xpath("(//*[text()=\"Game Center\"])[3]");
    private By standings = By.xpath("(//*[@href=\"/en/euroleague/standings/\"])[3]");
    private By teams = By.xpath("(//*[text()=\"Teams\"])[3]");
    private By players = By.xpath("(//*[text()=\"Players\"])[3]");
    private By stats = By.xpath("(//*[text()=\"Stats\"])[3]");

    private By loginButton = By.xpath("(//*[@type=\"button\"])[16]");
    private By languageButton = By.xpath("(//*[@type=\"button\"])[17]");
    private By serbianLanguage = By.xpath("(//*[text()=\"Srpski\"])[5]");

    private By euroleagueTv = By.xpath("(//img[@width=\"105\"])[4]");
    private By euroleagueStore = By.xpath("(//img[@width=\"105\"])[5]");
    private By euroleagueFantasy = By.xpath("(//img[@width=\"105\"])[6]");

    private By youtubeButton = By.xpath("(//*[@rel=\"noreferrer noopener\"])[1]");
    private By twitterButton = By.xpath("(//*[@rel=\"noreferrer noopener\"])[3]");
    private By facebookButton = By.xpath("(//*[@rel=\"noreferrer noopener\"])[2]");
    private By instagramButton = By.xpath("(//*[@rel=\"noreferrer noopener\"])[4]");

    private By footerText = By.xpath("//*[@aria-roledescription=\"footer\"]");
    private By banner = By.xpath("(//*[@fill=\"none\"])[4]");
    private By socialLinks = By.xpath("//*[@aria-label=\"social links\"]");


//    -METODE:


    public void checkHeaderLinks() {
        isDisplayed(euroleagueLogo);
        click(news);
        click(gameCenter);
        click(standings);
        click(teams);
        click(players);
        click(stats);
    }

    public void goToLogin() {
        isDisplayed(loginButton);
        click(loginButton);

    }

    public void closeBaner() {
        waitForVisible(banner);
        click(banner);
    }

    public void checkNews() {
        isDisplayed(news);
        click(news);
    }

    public void checkGameCenter() {
        isDisplayed(gameCenter);
        click(gameCenter);
    }

    public void checkStandings() {
        isDisplayed(standings);
        click(standings);
    }

    public void checkTeams() {
        isDisplayed(teams);
        click(teams);
    }

    public void checkPlayers() {
        isDisplayed(players);
        click(players);
    }

    public void checkStats() {
        isDisplayed(stats);
        click(stats);
    }

    public void changeLanguage() {
        isDisplayed(languageButton);
        click(languageButton);
        click(serbianLanguage);
    }

    public void scrollAndOpenSocialLinks() throws InterruptedException {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(footerText));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        click(youtubeButton);


//        -YOUTUBE:

        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        waitForVisible(By.id("page-header-banner")).isDisplayed();
        driver.close();
        driver.switchTo().window(tabs1.get(0));

//        -FACEBOOK

        click(facebookButton);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForVisible(By.xpath("(//*[@style=\"height: 168px; width: 168px;\"])[2]")).isDisplayed();
        driver.close();
        driver.switchTo().window(tabs2.get(0));

//        -TWITTER:

        click(twitterButton);
        ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        waitForVisible(By.xpath("(//*[@style=\"color: rgb(239, 243, 244);\"])[3]")).isDisplayed();
        driver.close();
        driver.switchTo().window(tabs3.get(0));

//        -INSTAGRAM:

        click(instagramButton);
        ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        waitForVisible(By.xpath("(//*[@role=\"img\"])[1]")).isDisplayed();
        driver.close();
        driver.switchTo().window(tabs4.get(0));

    }
}
