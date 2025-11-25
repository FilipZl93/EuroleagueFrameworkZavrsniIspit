package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class InvalidLoginPage extends BasePage {


//    -KONSTRUKTOR:

    public InvalidLoginPage(WebDriver driver, Duration timeout) {
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

    public void invalidLoginAction() {
        isDisplayed(emailInputField);
        isDisplayed(passwordInputField);
        clearAndType(emailInputField, "lazarevicfilip001@gmail.com");
        clearAndType(passwordInputField, "1234512345FL");
        click(confirmLoginButton);

        driver.findElement(By.xpath("//*[text()=\"Enjoy all the perks of your Euroleague ID. Log in now!\"]")).isDisplayed();
        driver.findElement(By.xpath("//*[text()=\"Forgot password?\"]")).isDisplayed();

    }
}
