package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class UserInputDataStep extends Base {

    LoginPage loginPage = new LoginPage(driver);
   AdminPage adminPage = new AdminPage(driver);

    public static boolean switchtoRightWindow(String windowTitle, List<String> hList) {
        for(String e : hList) {
            String title = driver.switchTo().window(e).getTitle();
            if(title.contains(windowTitle)) {
                System.out.println("found the right window");
                return true;
            }
        }
        return false;
    }


    @Given("I am in the login page")
    public void i_am_in_the_login_page() {
      loginPage.navigateUrl(host);
    }

    @Then("I fill user email {string}")
    public void i_fill_user_email(String uerEmail) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      loginPage.enterUserEmail(uerEmail);
    }
    @Then("I fill user password {string}")
    public void i_fill_user_password(String userPassword) {
     loginPage.enterUserPass(userPassword);
    }
    @Then("I click on login button")
    public void i_click_on_login_button() {
       loginPage.clickLoginBtn();
    }

    @Given("I click on the admin button")
    public void iClickOnTheAdminButton() {
         adminPage.clickAdminbtn();
    }

    @When("I click on the stakeholder Management")
    public void iClickOnTheStakeholderManagement()  {

        windowhandles();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adminPage.clickStackHolder();
    }

    @Then("I Select on the Stakeholder information")
    public void iSelectOnTheStakeholderInformation() {

        adminPage.clickOnStkInfo();
    }

    @Then("I want to click on add data sign")
    public void iWantToClickOnAddDataSign()  {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      adminPage.clickOnAddData();

    }


    @Then("I CLick on working area")
    public void iSelectWorkingArea() {

        Set<String> handles = driver.getWindowHandles();
        List<String> hList = new ArrayList<String>(handles);
        if (switchtoRightWindow("Add Data", hList)) {
        }
        WebElement titleElement = adminPage.getAddDataTitleElement();
        String expectedTitle = "Add Data";
        String actualTitle = titleElement.getText();
        assertEquals(expectedTitle, actualTitle);
        adminPage.ClickWorkingArea();


    }

    @And("I Click on uganda country office")
    public void iClickOnUgandaCountryOffice(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adminPage.clickMisoliButton();
    }


    @And("I fill value of villageArea {string}")
    public void iFillValueOfVillageArea(String villageName) {
        adminPage.fillValueOfVillage(villageName);
    }

    @And("I CLick on village name")
    public void iCLickOnVillageName(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     adminPage.clickonVillageNmae();
    }

    @And("I click on next button")
    public void iClickOnNextButton() {
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adminPage.clickNextButton();
    }

    @And("I fill name {string}")
    public void iFillName(String name)  {
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adminPage.enterNAME(name);
    }


    @And("I select gender")
    public void iSelectGender()  {
        adminPage.selectGender();
    }

    @And("I select stakholder type")
    public void iSelectStakholderType() {

        adminPage.selectStackHolder();
    }

    @And("I select designation")
    public void iSelectDesignation(){

        adminPage.selectDesignation();
    }

    @And("I fill phone number {string}")
    public void iFillPhoneNumber(String phone) {
        adminPage.enterPhoneNumber(phone);
    }

    @And("I select disability")
    public void iSelectDisability() {

        adminPage.selectDisability();
    }

    @Then("I click save button")
    public void iClickSaveButton() {
        adminPage.clickSaveBtn();
    }
}
