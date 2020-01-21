package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {

    public HomePage(){

        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@id=\"nav-overlay\"]/div/div[2]/nav/ul/li[1]/a")
    public WebElement personal;

    @FindBy(xpath = "//*[@id=\"dropdown0\"]/li[2]/a")
    public WebElement checking;

    public void navigateToHomePage(){
        SeleniumUtils.click(personal);
    }

}