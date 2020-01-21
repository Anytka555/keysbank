package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;


    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHomeTitle(){

        Assert.assertEquals(driver.getTitle(), "Keysbank Credit Cards, Bank, and Loans - Personal and Business");
    }

}
