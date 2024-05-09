package pages;

import base.Base;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.x500.X500Principal;
import java.time.Duration;

public class AdminPage extends Base {

    @FindBy(xpath = "//div[@class='module-icon-container']")
    private WebElement adminBtn;

     @FindBy(xpath = " //span[text()=' Stakeholder Management ']")
     private WebElement stackholderClick;

    @FindBy(xpath = "//span[text()=' Stakeholder Information ']")
    private WebElement stkInfoClick;

    @FindBy(xpath = "//mat-icon[contains(@mattooltip, 'Add Data')]")
    private WebElement clickAddData;

    @FindBy(id= "mat-select-value-11")
    private WebElement clickOnWorkingArea;

   @FindBy(css = "div.stl-slide-form-title")
   private WebElement titleGet;
    @FindBy(xpath = "//*[@id='cdk-drop-list-2']/mat-tree-node[5]/span")
    private WebElement misoliButton;

    @FindBy(xpath = "//*[@id='cdk-drop-list-3']/mat-tree-node[1]/button/span[1]")
    private WebElement clickCountryHeadOffice;

    @FindBy(id = "mat-input-4")
    private WebElement villageNameSend;

    @FindBy(xpath = "//*[@id='cdk-step-content-0-0']/div[2]/button[2]/span[1]")
    private WebElement nextButton;

    @FindBy(id = "mat-input-5")
    private WebElement nameElement;

    @FindBy(id = "mat-select-value-13")
    private WebElement clickGender;
    @FindBy(xpath = "//mat-option/span[contains(text(), 'Male')]")
    private WebElement selectGender;

    @FindBy(id = "mat-select-value-17")
    private WebElement clickStackholder;

    @FindBy(xpath = "//*[@id='mat-option-25']/span/div")
    private WebElement selctstakholder;

    @FindBy(id = "mat-input-6")
    private WebElement enterPhNumber;



    @FindBy(id = "mat-select-value-19")
    private WebElement clickdesignation;

    @FindBy(xpath = "//*[@id='mat-option-23']/span/div")
    private WebElement selctdesignation;

    @FindBy(id = "mat-select-value-15")
    private WebElement disabilityClick;

    @FindBy(xpath = "//mat-option/span[contains(text(), 'no')]")
    private WebElement disabilitySelect;


    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/div[2]/button[2]/span[1]")
    private WebElement saveButton;

    public AdminPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSaveBtn(){
        saveButton.click();
    }
    public void selectDisability(){
        fluentWaitClick(disabilityClick);
        disabilitySelect.click();

    }
    public void enterPhoneNumber(String phone){
      enterPhNumber.sendKeys(phone);
    }
    public void selectDesignation(){
        fluentWaitClick(clickdesignation);
        selctdesignation.click();
    }
    public void selectStackHolder(){
        fluentWaitClick(clickStackholder);
        selctstakholder.click();


    }

    public void selectGender(){
        fluentWaitClick(clickGender);
        selectGender.click();

    }
    public void enterNAME(String name){
        nameElement.sendKeys(name);
    }
       public void clickNextButton(){
        try {

            waitForWebdriver(driver, nextButton, Duration.ofSeconds(15));
            nextButton.click();
        }catch (StaleElementReferenceException e){

            waitForWebdriver(driver, nextButton, Duration.ofSeconds(15));
            nextButton.click();
        }

       }
    public void fillValueOfVillage(String villageName){
        waitForWebdriver(driver, villageNameSend, Duration.ofSeconds(15));
        villageNameSend.sendKeys(villageName);


    }
    public void clickonVillageNmae(){

        waitForWebdriver(driver, misoliButton, Duration.ofSeconds(15));
        misoliButton.click();
    }

    public void clickAdminbtn(){
        waitForWebdriver(driver, adminBtn, Duration.ofSeconds(5));
        adminBtn.click();
    }

    public void clickStackHolder(){
        stackholderClick.click();
    }

    public void clickOnStkInfo(){

        try{

            waitForWebdriver(driver, stkInfoClick, Duration.ofSeconds(20));
             stkInfoClick.click();
        }catch (NoSuchElementException e){
            waitForWebdriver(driver, stkInfoClick, Duration.ofSeconds(20));
            stkInfoClick.click();
        }

    }

    public void clickOnAddData(){
       // waitForWebdriver(driver, clickAddData, Duration.ofSeconds(7));
        clickAddData.click();
    }
    public void ClickWorkingArea() {
       fluentWaitClick(clickOnWorkingArea);

    }


    public WebElement getAddDataTitleElement() {
        return titleGet;
    }


    public void clickMisoliButton() {

        waitForWebdriver(driver, misoliButton, Duration.ofSeconds(20));
        misoliButton.click();
    }
}
