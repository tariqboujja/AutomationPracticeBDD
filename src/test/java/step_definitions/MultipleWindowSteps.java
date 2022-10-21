package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.MultipleWindowPage;
import utils.BrowserUtils;

import static pages.CommonPage.XPATH_TEMPLATE_LINKTEXT;

public class MultipleWindowSteps implements CommonPage {
    MultipleWindowPage page;

    public MultipleWindowSteps() {
        page = new MultipleWindowPage();
    }
    @When("I click a button Multiple-window page")
    public void iClickAButtonMultipleWindowPage() {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Multiple-window"))));
    }

    @Then("verify TLA button is enabled")
    public void verifyTLAButtonIsEnabled() {
        BrowserUtils.isEnabled(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Launch TLA"))));

    }


    @Then("verify Google button is enabled")
    public void verifyGoogleButtonIsEnabled() {
        BrowserUtils.isEnabled(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Launch Google"))));

    }

    @Then("verify Facebook button is enabled")
    public void verifyFacebookButtonIsEnabled() {
        BrowserUtils.isEnabled(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Launch Facebook"))));
    }


}
