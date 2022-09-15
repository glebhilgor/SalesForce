package tests;

import org.testng.annotations.Test;

public class AccountCreationTest extends BaseTest {

    @Test
    public void createAccount() {
        loginPage.open();
        loginPage.login("glebhilgor@gmail.com", "Transcond8895");
        newAccountPage.open();
        newAccountPage.createAccount();
        newAccountPage.creation("Hot", "Sanya", "+375446666666", "001",
                "sasha229.by", "Public", "Agriculture", "Pobediteley 17");
    }
}