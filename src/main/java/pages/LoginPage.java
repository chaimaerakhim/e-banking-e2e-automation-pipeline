package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

/*    @FindBy(xpath= "//input[contains(@value,'Find Flights')]")*/

   /* public WebElement findLoginButton;*/

    @FindBy(linkText = "Sign in")
    public WebElement findLoginButton;

    @FindBy(id = "login_field")
    public WebElement Loginfield;

    @FindBy(id = "password")
    public WebElement Passwordfield;

    @FindBy(name = "commit")
    public WebElement SubmitButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        open();
    }

   public void ClickLoginButton(){
        findLoginButton.click();
    }

    public void FillLoginfield(){
        Loginfield.click();
        Loginfield.clear();
        Loginfield.sendKeys("chaimaarakhime@gmail.com");
    }

    public void FillPasswordfield(){
        Passwordfield.click();
        Passwordfield.clear();
        Passwordfield.sendKeys("1995$2018Cr");
    }

    public void ClickSubmitButton(){
        SubmitButton.click();
    }
}
