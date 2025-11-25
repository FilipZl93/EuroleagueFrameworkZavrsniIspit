package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage extends BasePage {

//    -KONSTRUKTOR:

    public LoginPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

//    -LOKATORI:

    private By emailInputField = By.id("signin_email");
    private By passwordInputField = By.id("signin_password");
    private By viewBoxpass = By.xpath("(//*[@viewBox=\"0 0 16 16\"])[23]");
    private By confirmLoginButton = By.xpath("//*[@type=\"submit\"]");
    private By textEuroleagueId = By.xpath("//*[text()=\"Login with your EuroLeague ID\"]");
    private By withoutAccount = By.xpath("//*[text()=\"Don’t have an account?\"]");
    private By registerPath = By.xpath("//*[text()=\"Register\"]");
    private By closeLoginPageButton = By.xpath("(//*[@height=\"12\"])[9]");
    private By forgotPasswordPath = By.xpath("//*[text()=\"Forgot password?\"]");


//    -METODE:

    public void loginAction() {
        isDisplayed(emailInputField);
        isDisplayed(passwordInputField);
        clearAndType(emailInputField, "lazarevicfilip0@gmail.com");
        clearAndType(passwordInputField, "Delijesever1989!");
        click(confirmLoginButton);

        WebElement logoEuroleague = driver.findElement(By.xpath("(//*[text()=\"Euroleague\"]) [3]"));
        logoEuroleague.isDisplayed();
        WebElement news = driver.findElement(By.xpath("(//*[text()=\"News\"])[3]"));
        news.isDisplayed();
    }
}
