package manager;

import com.microsoft.playwright.*;

public class BrowserManager {
    private Playwright playwright;
    private Browser browser;
    private Page page;

    public void setup(boolean headless) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
        page = browser.newContext().newPage();
    }

    public Page getPage() {
        return page;
    }

    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}