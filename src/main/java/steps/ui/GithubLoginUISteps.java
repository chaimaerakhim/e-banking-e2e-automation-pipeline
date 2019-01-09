package steps.ui;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPage;

public class GithubLoginUISteps {
    public LoginPage loginPage;

    @Step
    public void GithubLogin() {
        loginPage.ClickLoginButton();
        loginPage.FillLoginfield();
        loginPage.FillPasswordfield();
        loginPage.ClickSubmitButton();
    }
}