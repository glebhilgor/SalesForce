package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.NewContactPage;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ContactCreationTest extends BaseTest {

    @Test
    public void createContact() {
        loginPage.open();
        loginPage.login("glebhilgor@gmail.com", "Transcond8895");
        newContactPage.openPage();
        newContactPage.createNewContact();
        newContactPage.creation("Sanya", "Lukash", "Mrs.", "+375296666666",
                "0000001", "375296666666", "historical", "3%",
                "sasha@mail.by", "01.01.1956", "Web", "Pobediteley 17");
    }

}