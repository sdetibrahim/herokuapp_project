package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import manager.BrowserManager;

import java.io.File;
import java.nio.file.Paths;

public class UploadPage {


    private Page page;

    public UploadPage(Page page) {
        this.page = page;
    }


    public boolean isFileUploadButtonEnabled() {
        return page.locator("#file-upload").isEnabled();
    }

    public boolean isFileSubmitButtonEnabled() {
        return page.locator("#file-submit").isEnabled();
    }

    public void clickUploadSubmitButton() {
        page.locator("#file-submit").click();
        page.waitForLoadState();
    }

    public boolean isInternalServerErrorVisible() {
        return page.locator("text='Internal Server Error'").isVisible();
    }

    public void goBackPreviousPage() {
        page.goBack();
        page.waitForLoadState();
    }

    public void uploadFile() {

        File upload_File = new File("src/test/java/upload_file/photo.jpg");
        page.setInputFiles("#file-upload", Paths.get(upload_File.getAbsolutePath()));

        page.click("#file-submit");
        page.waitForSelector("text='File Uploaded!'");
    }
}