package bdd.runner;

import bdd.webdriver.WebDriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.java.After;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/build/cucumber.json"},
        stepNotifications = true,
        publish = true,
        features = {"src/test/resources/features"},
        glue = {"bdd.stepdefinition"},
        tags ="@TEST1 or @TEST2")


public class Runner {

    @AfterClass
    public static void tearDown() {
        WebDriverFactory.getWebDriver().quit(); // Llama al método para cerrar el navegador
    }
}
