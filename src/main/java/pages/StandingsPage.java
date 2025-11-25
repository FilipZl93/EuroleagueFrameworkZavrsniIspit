package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class StandingsPage extends BasePage {

//    -KONSTRUKTOR:

    public StandingsPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    -LOKATORI:

    private By standingsText = By.xpath("(//*[text()=\"Standings\"])[4]");

    private By tableView = By.id("lblstatsFilterstype");
    private By filterSeason = By.id("lblstatsFiltersseason");
    private By position = By.xpath("//*[text()=\"Pos\"]");
    private By club = By.xpath("//*[text()=\"Club\"]");
    private By playInRules = By.xpath("//*[text()=\"7th-10th Place - Play-in Qualification\"]");
    private By allFilters = By.xpath("//*[text()=\"All filters\"]");
    private By standingsView = By.xpath("//*[text()=\"Standings view\"]");
    private By applyButtonFilter = By.xpath("//*[@type=\"submit\"]");
    private By euroleagueLogo = By.xpath("(//*[@width=\"64\"])[1]");
    private By footer = By.xpath("//*[@aria-roledescription=\"footer\"]");


//    -METODE:


    public void confirmFilters() {
        isDisplayed(allFilters);
        click(allFilters);
        isDisplayed(standingsView);
        click(applyButtonFilter);
    }

    public void scrollToPlayInRules() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(playInRules));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void backToHomePage() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(footer));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        click(euroleagueLogo);

        WebElement euroleagueLogo = driver.findElement(By.xpath("(//*[text()=\"Euroleague\"]) [3]"));
        euroleagueLogo.isDisplayed();
    }
}
