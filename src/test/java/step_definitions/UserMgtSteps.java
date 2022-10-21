package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.UserMgtPage;
import utils.BrowserUtils;

import static pages.CommonPage.XPATH_TEMPLATE_LINKTEXT;


public class UserMgtSteps {
    UserMgtPage page;

    public UserMgtSteps(){
        page = new UserMgtPage();
    }

    @Then("Verify title of the page is Register New User")
    public void verifyTitleOfThePageIsRegisterNewUser() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(),
                "Register New User");
    }

    @Then("Verify Login button is present")
    public void verifyLoginButtonIsPresent() {
        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.loginBtn));
    }
    @Then("verify First Name input field is displayed")
    public void verifyFirstNameInputFieldIsDisplayed() {
        BrowserUtils.isDisplayed(page.firstName);


    }

    @Then("verify Last Name input field is displayed")
    public void verifyLastNameInputFieldIsDisplayed() {
        BrowserUtils.isDisplayed(page.lastName);
    }

    @Then("verify Phone Number input is displayed")
    public void verifyPhoneNumberInputIsDisplayed() {
        BrowserUtils.isDisplayed(page.phoneNumber);
    }

    @And("verify Email address input is displayed")
    public void verifyEmailAddressInputIsDisplayed() {
        BrowserUtils.isDisplayed(page.email);
    }



}