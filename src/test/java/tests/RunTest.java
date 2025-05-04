package tests;

import com.microsoft.playwright.Page;
import manager.BrowserManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ListsPage;
import pages.UploadPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunTest {

    private BrowserManager browserManager;
    private UploadPage uploadPage;
    private ListsPage listsPage;

    @BeforeEach
    void setUp() {
        browserManager = new BrowserManager();
        browserManager.setup(false);

        Page page = browserManager.getPage();
        uploadPage = new UploadPage(page);
        listsPage=new ListsPage(page);
    }

    @AfterEach
    void tearDown() {

        browserManager.tearDown();
    }

    @Test
    void uploadTest(){

       listsPage.goToListPage();

       assertTrue(listsPage.isFileUploadLinkEnabled(), "File upload link should be enabled by default");

       listsPage.clickFileUploadLink();

       assertTrue(uploadPage.isFileUploadButtonEnabled(), "Choose file button should be enabled by default");
       assertTrue(uploadPage.isFileSubmitButtonEnabled(), "File upload submit button should be enabled by default");

       uploadPage.clickUploadSubmitButton();

       assertTrue(uploadPage.isInternalServerErrorVisible(), "Server error should be displayed when attempting to upload without selecting a file");

       uploadPage.goBackPreviousPage();

       uploadPage.uploadFile();

    }
}