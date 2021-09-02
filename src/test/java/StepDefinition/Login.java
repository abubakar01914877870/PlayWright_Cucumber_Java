package StepDefinition;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.Given;

public class Login {
    @Given("I go to url {string}")
    public void iGoToUrl(String arg0) {
        System.out.println(arg0);
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate(arg0);
            System.out.println(page.title());
        }
    }
}
