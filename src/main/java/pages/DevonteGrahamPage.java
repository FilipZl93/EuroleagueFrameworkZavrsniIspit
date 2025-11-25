package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class DevonteGrahamPage extends BasePage {

//    -KONSTRUKTOR:

    public DevonteGrahamPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    LOKATORI:

    private By grahamPicture = By.xpath("//*[@alt=\"DEVONTE GRAHAM\"]");
    private By grahamText = By.xpath("//*[text()=\"DEVONTE GRAHAM\"]");
    private By devonteNumber = By.xpath("//*[text()=\"#4\"]");
    private By devontePosition = By.xpath("//*[text()=\"Guard\"]");
    private By devonteNationality = By.xpath("//*[text()=\"United States of America\"]");
    private By devonteHeight = By.xpath("//*[text()=\"185 cm\"]");
    private By devonteBirthday = By.xpath("//*[text()=\"22 Feb 1995\"]");

    private By clubLogo = By.xpath("(//*[@alt=\"Crvena Zvezda Meridianbet Belgrade\"])[3]");
    private By devonteStat = By.xpath("//*[text()=\"Stats\"]");
    private By devonteProfile = By.xpath("//*[text()=\"Profile\"]");
    private By devonteRecords = By.xpath("//*[text()=\"Records\"]");

    private By euroleagueLogo = By.xpath("//*[@alt=\"EuroLeague Logo\"]");
    private By footer = By.xpath("//*[@aria-roledescription=\"footer\"]");


//    -METODE:

    public void checkProfileLinks() {
        isDisplayed(grahamPicture);
        click(devonteStat);
        click(devonteProfile);
        click(devonteRecords);
    }

    public void goBackToHomePage() {
        isDisplayed(euroleagueLogo);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(footer));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        click(euroleagueLogo);
        isDisplayed(euroleagueLogo);

    }
}
