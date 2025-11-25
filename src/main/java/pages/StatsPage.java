package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class StatsPage extends BasePage {

//    -KONSTRUKTOR:

    public StatsPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    -LOKATORI:

    private By statsText = By.xpath("(//*[text()=\"Stats\"])[4]");
    private By presentedBy = By.xpath("//*[text()=\"Presented by\"]");
    private By euroleagueLogo = By.xpath("(//*[@alt=\"Euroleague\"])[3]");
    private By footer = By.xpath("//*[@aria-roledescription=\"footer\"]");


    private By generalInfo = By.xpath("//*[text()=\"General\"]");
    private By playersInfo = By.xpath("(//*[text()=\"Players\"])[4]");
    private By teamsInfo = By.xpath("(//*[text()=\"Teams\"])[4]");

    private By viewBox = By.xpath("(//*[@viewBox=\"0 0 24 24\"])[5]");
    private By confirmViewBox = By.xpath("(//*[@type=\"button\"])[60]");
    private By applyFilters = By.xpath("//*[@viewBox=\"0 0 18 18\"]");
    private By changeViewButton = By.xpath("//*[text()=\"Change view\"]");

    private By clearAllFiltersButton = By.xpath("//*[text()=\"Clear filters\"]");
    private By applyFiltersButton = By.xpath("//*[text()=\"Apply filters\"]");


//    -METODE:

    public void checkInfoStat() {
        isDisplayed(statsText);
        click(playersInfo);
        click(generalInfo);
        click(teamsInfo);
    }

    public void clearAndApplyFilters() {
        click(applyFilters);
        isDisplayed(changeViewButton);
        click(clearAllFiltersButton);
        click(applyFiltersButton);
    }

    public void backToHomePage() {
        isDisplayed(euroleagueLogo);
        click(euroleagueLogo);
    }
}
