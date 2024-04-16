package bdd.step;

import bdd.page.BuyProductsPage;

public class BuyProductsStep {

    public BuyProductsPage buyProductsStep(){
        return new BuyProductsPage();
    }

    public void stepStartBrowser(String url) {buyProductsStep().startBrowser(url);}

    public void stepClickSearchBtn() {buyProductsStep().clickSearchBtn();}

    public void stepWriteOnSearch(String txtSearch) {buyProductsStep().writeOnSearch(txtSearch);}

    public void stepClickAddProduct1() {buyProductsStep().clickAddProduct1();}

    public void stepClickAddProduct2() {buyProductsStep().clickAddProduct2();}

    public void stepClickAddProduct3() {buyProductsStep().clickAddProduct3();}

    public void stepClickBtnCart() {buyProductsStep().clickBtnCart();}

    public void stepClickBtnPlus1() {buyProductsStep().clickBtnPlus1();}

    public void stepClickBtnEmptyCart() {buyProductsStep().clickBtnEmptyCart();}

    public void stepClickBtnConfirmEmpty() {buyProductsStep().clickBtnConfirmEmpty();}


}











