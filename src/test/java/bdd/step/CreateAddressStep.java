package bdd.step;

import bdd.page.CreateAddressPage;

public class CreateAddressStep {

    public CreateAddressPage createAddressPage(){
        return new CreateAddressPage();
    }

    public void stepIniciarNavegador(String url){
        createAddressPage().iniciarNavegador(url);
    }

    public void stepClickButtonDelivey (){
        createAddressPage().clickonButtonDeliveryMethod();
    }

    public void stepClickonBtnCreateAddress(){createAddressPage().clickonBtnCreateAddress();}

    public void stepWriteAddressForm(String txtAddress) {createAddressPage().writeAddressForm(txtAddress);}

    public void stepAddNumberHouse(String txtNumberHouse) {createAddressPage().addNumberHouse(txtNumberHouse);}

    public void stepAddNameAddress (String txtNameAddress) {createAddressPage().addNameAddress(txtNameAddress);}

    public void stepAddAdditionalInstructions (String txtAdditionalInstructions) {createAddressPage().addAdditionalInstructions(txtAdditionalInstructions);}

    public void stepClickSaveBtn () {createAddressPage().clickSaveBtn();}

    public void stepSelectAddAddress(){createAddressPage().selectAddAddress();}

    public void stepClickConfirmBtn(){createAddressPage().clickConfirmBtn();}

    public String stepValidateDeliveryAddress(){return createAddressPage().validateDeliveryAddress();}










}
