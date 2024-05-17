package bdd.page;

import bdd.webdriver.DOM;
import bdd.webdriver.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyProductsPage extends DOM {

    @FindBy (xpath = "//input[contains(@class,'new-header-search-input')]")
    WebElement btnSearch;

    @FindBy(xpath = "//button[contains(@class,'new-header-search-submit')]")
    WebElement getBtnSearch;

    @FindBy(xpath = "(//button[@aria-label='Agregar'][contains(.,'Agregar')])[1]")
    WebElement btnAdd1;

    @FindBy(xpath = "(//button[contains(@aria-label,'Agregar')])[6]")
    WebElement btnAdd2;

    @FindBy(xpath = "(//button[@aria-label='Agregar'])[21]")
    WebElement btnAdd3;

    @FindBy(xpath = "//i[@class='jumbo-icon-shopping-cart']")
    WebElement btnAddCart;

    @FindBy(xpath = "(//button[contains(@class,'minicartcontent-quantity-btn jumbo-icon-plus ')])[1]")
    WebElement btnplus1;

    @FindBy(xpath = "//button[contains(.,'Vaciar carro')]")
    WebElement btnEmptyCart;

    @FindBy(xpath = "//button[contains(@class,'primary-btn modal-confirmation-delete-btn')]")
    WebElement btnConfirmEmpty;

    public void startBrowser(String url){initializeBrowser(url);}

    public void clickSearchBtn () {
        onclick(btnSearch);
    }


    public void writeOnSearch (String txtSearch){
        type(btnSearch, txtSearch);
        onclick(getBtnSearch);
    }

    public void clickAddProduct1 (){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scrollToElement(btnAdd1);
        onclick(btnAdd1);
    }

    public void clickAddProduct2() {
        scrollToElement(btnAdd2);
        onclick(btnAdd2);
    }

    public void clickAddProduct3() {
        scrollToElement(btnAdd3);
        onclick(btnAdd3);

    }

    public void clickBtnCart(){
        waitVisibilityOfElement(btnAddCart, 50);
        onclick(btnAddCart);
    }

    public void clickBtnPlus1(){
        waitVisibilityOfElement(btnplus1, 50);
        onclick(btnplus1);
        onclick(btnplus1);
    }

    public void clickBtnEmptyCart() {
        onclick(btnEmptyCart);
    }

    public void clickBtnConfirmEmpty(){
        onclick(btnConfirmEmpty);
    }


}
