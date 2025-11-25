package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CrvenaZvezdaTeamPage extends BasePage {

//    -KONSTRUKTOR:

    public CrvenaZvezdaTeamPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    -LOKATORI:

    private By clubName = By.xpath("//*[text()=\"Crvena Zvezda Meridianbet Belgrade\"]");
    private By wonStat = By.xpath("//*[text()=\"Won\"]");
    private By loseStat = By.xpath("//*[text()=\"Lost\"]");
    private By addToFantasyButton = By.xpath("//*[text()=\"Add to Fantasy\"]");

    private By navigationLinks = By.xpath("//*[@role=\"navigation\"]");


    private By guardsList = By.xpath("//*[text()=\"Guard\"]");
    private By forwardsList = By.xpath("//*[text()=\"Forward\"]");
    private By centersList = By.xpath("//*[text()=\"Center\"]");
    private By coachesList = By.xpath("//*[text()=\"Coaches\"]");

    private By teamInfo = By.xpath("//*[text()=\"Team\"]");
    private By gamesSchedule = By.xpath("//*[text()=\"Games\"]");
    private By statsInfo = By.xpath("(//*[text()=\"Stats\"])[4]");
    private By rosterInfo = By.xpath("(//*[text()=\"Roster\"])[2]");

    private By codiMiller = By.xpath("(//img[@width=\"95\"])[1]");
    private By devonteGraham = By.xpath("//*[@alt=\"DEVONTE GRAHAM\"]");
    private By tysonCarter = By.xpath("//*[@alt=\"TYSON CARTER\"]");
    private By chimaMoneke = By.xpath("//*[@alt=\"CHIMA MONEKE\"]");
    private By sasaObradovic = By.xpath("//*[@alt=\"SASA OBRADOVIC\"]");

//    -METODE:

    public void checkSchedule() {
        isDisplayed(gamesSchedule);
        click(gamesSchedule);
    }

    public void goToDevonteGrahamProfile() {
        isDisplayed(devonteGraham);
        click(devonteGraham);
    }

    public void goToRoster() {
        isDisplayed(rosterInfo);
        click(rosterInfo);
    }
}
