package bdd.stepdefinition;

import bdd.step.BuyProductsStep;
import bdd.webdriver.DOM;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.After;
import org.junit.Before;

public class BuyProductsStepDefinition {
    private final BuyProductsStep buyProductsStep;

    private static DOM dom;
    private Scenario scenario;

    public BuyProductsStepDefinition() {
        this.buyProductsStep = new BuyProductsStep();
        if (dom == null) {
            dom = new DOM();
        }
    }

    @AfterStep
    public void afterEachStep(Scenario scenario){
        this.scenario = scenario;
        dom.takeScreenShot(scenario);
    }

    @After
    public void afterScenario(){dom.quitDriver();}

    @Given("login to the jumbo site {string}")
    public void startBrowser (String url) {
        buyProductsStep.stepStartBrowser(url);
    }

    @When("Click on: Search")
    public void clickSearchBtn() {buyProductsStep.stepClickSearchBtn();}

    @And("Write on search {string}")
    public void writeOnSearch(String txtSearch){buyProductsStep.stepWriteOnSearch(txtSearch);}

    @And("Click on: Always night towels")
    public void clickAddProduct1(){buyProductsStep.stepClickAddProduct1();}

    @And("Click on: Kotex ultra fine towels")
    public void clickAddProduct2() {buyProductsStep.stepClickAddProduct2();}

    @And("Click on: Toallas Higiénicas Ladysoft Básicas Sin Alas")
    public void clickAddProduct3() {buyProductsStep.stepClickAddProduct3();}

    @And("Click on: Shopping cart")
    public void clickBtnCart() {buyProductsStep.stepClickBtnCart();}

    @And("2 Click on: Plus button on Kotex ultra fine towels")
    public void clickBtnPlus1(){buyProductsStep.stepClickBtnPlus1();}

    @And("Click on: Empty cart")
    public void clickBtnEmptyCart() {buyProductsStep.stepClickBtnEmptyCart();}

    @And("Click on: Confirm empty cart")
    public void clickBtnConfirmEmpty() {buyProductsStep.stepClickBtnConfirmEmpty();}

}
