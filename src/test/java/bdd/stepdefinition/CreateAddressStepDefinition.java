package bdd.stepdefinition;

import bdd.step.CreateAddressStep;
import bdd.webdriver.DOM;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;

public class CreateAddressStepDefinition {

    private final CreateAddressStep createAddressStep;
    private static DOM dom;
    private Scenario scenario;


    public CreateAddressStepDefinition() {
        this.createAddressStep = new CreateAddressStep();
        if (dom == null){
            dom = new DOM();
        }
    }


    @After
    public void afterScenario(){
        dom.quitDriver();
    }

    @BeforeStep
    public void beforeEachStep(Scenario scenario){
        this.scenario = scenario;
        dom.takeScreenShot(scenario);
    }

    @Given("login to the jumbo website {string}")
    public void loginToTheJumboWebsite (String url){
        createAddressStep.stepIniciarNavegador(url);
    }

    @When("Click on: Select a delivery method")
    public void clickButtonDelivery(){
        createAddressStep.stepClickButtonDelivey();
    }

    @And("Click on: Create an address")
    public void clickBtnCreateAddress(){createAddressStep.stepClickonBtnCreateAddress();}

    @And("Write address {string}")
    public void writeFormAddress(String txtAddress) {createAddressStep.stepWriteAddressForm(txtAddress);}

    @And("Write house number {string}")
    public void addNumberHouse (String txtNumberHouse) {createAddressStep.stepAddNumberHouse(txtNumberHouse);}

    @And("White name the address {string}")
    public void addNameAddress (String txtNameAddress) {createAddressStep.stepAddNameAddress(txtNameAddress);}

    @And("White additional instructions {string}")
    public void additionalInstructions (String txtAdditionalInstructions) {createAddressStep.stepAddAdditionalInstructions(txtAdditionalInstructions);}

    @And("Click on: Add Address button")
    public void clickSaveBtn(){createAddressStep.stepClickSaveBtn();}

    @And("Select Added Address")
    public void selectAddAddress(){createAddressStep.stepSelectAddAddress();}

    @And("Click on: the confirm button")
    public void clickConfirmBtn(){createAddressStep.stepClickConfirmBtn();}

    @Then("validate that the address is on the button {string}")
    public void validateDeliveryAddress(String txtResuldoEsperado){
        Assertions.assertEquals(txtResuldoEsperado, createAddressStep.stepValidateDeliveryAddress());
    }








}
