package AppTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;

import java.time.Duration;
import java.util.logging.StreamHandler;

public class EuroleagueByFlowTests extends BaseTest {

    HomePageEuroleague homePageEuroleague = new HomePageEuroleague(driver, Duration.ofSeconds(35));
    LoginPage loginPage = new LoginPage(driver, Duration.ofSeconds(35));
    StandingsPage standingsPage = new StandingsPage(driver, Duration.ofSeconds(35));
    TeamsPage teamsPage = new TeamsPage(driver, Duration.ofSeconds(35));
    CrvenaZvezdaTeamPage crvenaZvezdaTeamPage = new CrvenaZvezdaTeamPage(driver, Duration.ofSeconds(30));
    DevonteGrahamPage devonteGrahamPage = new DevonteGrahamPage(driver, Duration.ofSeconds(35));
    StatsPage statsPage = new StatsPage(driver, Duration.ofSeconds(35));
    InvalidLoginPage invalidLoginPage = new InvalidLoginPage(driver, Duration.ofSeconds(35));


    @Test
    public void checkOutWebAppEuroleague() throws InterruptedException {


//  - THREAD SLEEP-OVI SE NE STAVLJAJU U SAMOM TESTU, ALI OVDE JE SPECIFICNA SITUACIJA JER NE IZLAZI STANDARDNA ERROR PORUKA, VEC SE OTVARA PADAJUCA PORUKA KOJA TRAJE 3,4 SEKUNDE I POKRIVA VELILKI DEO HEADER-A, SAMIM TIM JE NEMOGUCE DA LINKOVI BUDU KLIKABILNI I NE MOZE DRUGACIJE DA SE RESI :)


        homePageEuroleague.checkHeaderLinks();
        homePageEuroleague.goToLogin();
        invalidLoginPage.invalidLoginAction();
        Thread.sleep(3000);
        loginPage.loginAction();
        Thread.sleep(3000);
        homePageEuroleague.closeBaner();
        homePageEuroleague.checkStandings();
        standingsPage.confirmFilters();
        standingsPage.scrollToPlayInRules();
        standingsPage.backToHomePage();
        homePageEuroleague.checkTeams();
        teamsPage.checkZvezdaTeam();
        crvenaZvezdaTeamPage.goToRoster();
        crvenaZvezdaTeamPage.goToDevonteGrahamProfile();
        devonteGrahamPage.goBackToHomePage();
        homePageEuroleague.checkStats();
        statsPage.checkInfoStat();
        statsPage.clearAndApplyFilters();
        statsPage.backToHomePage();
        homePageEuroleague.scrollAndOpenSocialLinks();

        Assert.assertTrue(driver.findElement(By.xpath("(//*[text()=\"Filip\"])[3]")).getText().contains("Filip"));
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@alt=\"Euroleague\"])[3]")).isDisplayed());
        WebElement euroCupShortcut = driver.findElement(By.xpath("(//*[@data-sizes=\"auto\"])[50]"));
        euroCupShortcut.isDisplayed();
        WebElement nextGenTournametShortcut = driver.findElement(By.xpath("(//*[@title=\"EUROLEAGUE BASKETBALL ADIDAS NEXT GENERATION TOURNAMENT\"])[2]"));
        nextGenTournametShortcut.isDisplayed();
    }
}

