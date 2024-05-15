package bdd.page;

import bdd.webdriver.DOM;
import org.bouncycastle.pqc.crypto.util.PQCOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAddressPage extends DOM {

    public void iniciarNavegador(String url){initializeBrowser(url);}

    @FindBy(xpath = "//button[@class='primary-btn popover-delivery-button']")
    WebElement btnDeliveryMethod;

    @FindBy(xpath = "//p[contains(@class,'deliver-address')]")
    WebElement btnDelivedAddress;

    @FindBy(xpath = "//a[@class='new-link'][.='crea una dirección']")
    WebElement btnCreateAddress;

    @FindBy(css = "[placeholder='Calle y número, comuna o referencia']")
    WebElement inputStreetAndNumber;

    @FindBy(xpath = "//div[@class='pac-item']/span[@class='pac-item-query']\n")
    WebElement btnFirstSuggestion;

    @FindBy(xpath = "//*[@id=\"general-portal\"]/div[2]/div[1]")
    WebElement popup;

    @FindBy (xpath = "//input[contains(@placeholder,'Ej: 208')]")
    WebElement inputHouseNumber;

    @FindBy(xpath = "//input[contains(@placeholder,'Ej: casa mamá')]")
    WebElement inputNameAddress;

    @FindBy(xpath = "//textarea[contains(@type,'text')]")
    WebElement inputAdditionalInstructions;

    @FindBy(xpath = "//button[contains(.,'Agregar dirección')]")
    WebElement btnSave;

    @FindBy(xpath = "(//input[contains(@class,'input-radio-button')])[1]")
    WebElement inputRadioButton;

    @FindBy(xpath = "//button[contains(.,'Confirmar')]")
    WebElement btnConfirm;


    public void clickonButtonDeliveryMethod(){
        implicitWaitOfElement(60);
        //waitVisibilityOfElement(btnDeliveryMethod,30);
        onclick(btnDeliveryMethod);}

    public void clickonBtnCreateAddress(){
        waitClikeableElement(btnCreateAddress, 10);
        onclick(btnCreateAddress);

    }

    public void writeAddressForm(String txtAddress){
        implicitWaitOfElement(10);
        onclick(inputStreetAndNumber);
        type(inputStreetAndNumber, txtAddress);
        onclick(btnFirstSuggestion);
        pressEnterKey();

    }

    public void addNumberHouse(String txtNumberHouse){
        onclick(inputHouseNumber);
        type(inputHouseNumber, txtNumberHouse);
    }

    public void addNameAddress(String txtNameAddress){
        onclick(inputNameAddress);
        type(inputNameAddress, txtNameAddress);
    }

    public void addAdditionalInstructions (String txtAdditionalInstructions) {
        onclick(inputAdditionalInstructions);
        type(inputAdditionalInstructions,txtAdditionalInstructions);
    }

    public void clickSaveBtn(){
        onclick(btnSave);
    }

    public void selectAddAddress(){
        onclick(inputRadioButton);
    }

    public void clickConfirmBtn(){
        onclick(btnConfirm);
    }

    public String validateDeliveryAddress(){
       return getText(btnDelivedAddress);
    }

   // public void quitBrowser(){
      //  quitDriver();}

}
