package ui;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.ui.FindFlightsUISteps;
import steps.ui.GithubLoginUISteps;

@RunWith(SerenityRunner.class)
public class GithubLoginUITest {
    @Managed
    WebDriver driver;

    @Steps
    GithubLoginUISteps githubLoginUISteps;

    @Test
    @WithTag(type="type", name="UI")
    public void  GithubLogin() {
        githubLoginUISteps.GithubLogin();
    }
}