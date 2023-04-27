package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userNameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@id='welcome']")
    public WebElement dashboardMsg;

    public loginPage(){
        PageFactory.initElements(driver, this);
    }
}
