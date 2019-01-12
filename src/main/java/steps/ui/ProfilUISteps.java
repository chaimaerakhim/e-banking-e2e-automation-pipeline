package steps.ui;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class ProfilUISteps {

    public LoginPage loginPage;


    @Step
    public void GithubLogin() {

        loginPage.ClickLoginButton();
        loginPage.FillLoginfield();
        loginPage.FillPasswordfield();
        loginPage.ClickSubmitButton();
    }
}