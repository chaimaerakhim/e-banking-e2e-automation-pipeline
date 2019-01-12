package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilPage extends PageObject {

    public ProfilPage(WebDriver driver) {
        super(driver);
        open();
    }

    @FindBy(linkText = "Sign in")
    public WebElement findLoginButton;

    @FindBy(id = "login_field")
    public WebElement Loginfield;





}



