package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmail;

    @FindBy(id = "password")
    private WebElement userPaasword;

    @FindBy(xpath = "//span[contains(text(), 'Sign in')]")
    private WebElement loginButton;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateUrl(String url) {
        navigateURL(url);
    }

    public void enterUserEmail(String email){
       // WebElement userEmailElement = fluentWait(userEmail);
        userEmail.clear();
        userEmail.sendKeys(email);
    }


    public void enterUserPass(String userPass){
        WebElement userEmailElement = fluentWait(userPaasword);
        userPaasword.sendKeys(userPass);
    }

    public void clickLoginBtn(){
        loginButton.click();
    }


}
