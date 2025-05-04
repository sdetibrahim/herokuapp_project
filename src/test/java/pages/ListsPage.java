package pages;

import com.microsoft.playwright.Page;


public class ListsPage {

    private static final String BASE_URL = "http://the-internet.herokuapp.com";

    private Page page;
    public ListsPage(Page page) {
        this.page = page;
    }


    public void goToListPage() {
        page.navigate(BASE_URL);
        page.waitForLoadState();
    }

    public boolean isFileUploadLinkEnabled() {
        return page.locator("a[href='/upload']").isEnabled();
    }

    public UploadPage clickFileUploadLink() {
        page.locator("a[href='/upload']").click();
        page.waitForLoadState();
        return new UploadPage(page);
    }
}
