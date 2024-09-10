package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegistrationTests extends ApplicationManager {

    @Test
    public void registrationTest (){

        Assert.assertTrue(new HomePage(getDriver())
                .clickBtnLoginHeader()
                .typeLoginForm("my_qa_email@email.com","Password123_!")
                .clickBtnRegistrationPositive()
                .isElementContactPresent());


    }
}
