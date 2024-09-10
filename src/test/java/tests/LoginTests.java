package tests;

import manager.ApplicationManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTests extends ApplicationManager {
    @Test
    public void loginPositiveTest (){
        boolean result = new HomePage(getDriver()).clickBtnLoginHeader()
                .typeLoginForm("qa_mail@mail.com", "Qwerty123!")
                .clickBtnLoginPositive().isElementContactPresent();
        Assert.assertTrue(result);


      //  Assert.assertEquals(100,200);
      //  Assert.assertTrue(true);
      //  Assert.assertFalse(false);


    }




}
