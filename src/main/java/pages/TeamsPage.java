package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TeamsPage extends BasePage {

//    -KONSTRUKTOR:

    public TeamsPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    -LOKATORI:

    private By teamsText = By.xpath("(//*[text()=\"Teams\"])[4]");
    private By searchTeamsInputField = By.id("searchInput");

    private By anadoluEfes = By.xpath("//*[@alt=\"Anadolu Efes Istanbul\"]");
    private By monacoAs = By.xpath("(//*[@alt=\"AS Monaco\"])[3]");
    private By crvenaZvezda = By.xpath("(//*[@alt=\"Crvena Zvezda Meridianbet Belgrade\"])[3]");
    private By partizanBc = By.xpath("(//*[@alt=\"Partizan Mozzart Bet Belgrade\"])[3]");
    private By searchZvezda = By.xpath("//*[text()=\"Crvena Zvezda Meridianbet Belgrade\"]");
    private By euroleagueLogo = By.xpath("(//*[@height=\"64\"])[1]");


//    -METODE:


    public void searchZvezda() {
        isDisplayed(searchTeamsInputField);
        clearAndType(searchTeamsInputField, "Crvena zvezda");
        click(searchZvezda);

    }

    public void checkMonacoTeam() {
        isDisplayed(monacoAs);
        click(monacoAs);
    }

    public void checkPartizanBcTeam() {
        isDisplayed(partizanBc);
        click(partizanBc);
    }

    public void checkEfesTeam() {
        isDisplayed(anadoluEfes);
        click(anadoluEfes);
    }

    public void checkZvezdaTeam() {
        isDisplayed(crvenaZvezda);
        click(crvenaZvezda);
    }
}
