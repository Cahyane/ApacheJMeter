package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopCart {
    private WebDriver driver;
    JavascriptExecutor js;
    public ShopCart() {
        this.driver = DriverSingleton.getDriver();
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = " //*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/h3/a") //1
    WebElement blackdress;
    public void Product(){
        js.executeScript("window.scrollBy(0,1000)");
        this.blackdress.click();}

    @FindBy (xpath =  "//*[@id='product-704']/div[1]/div[2]/form/div/div[2]/button" )
    WebElement btnaddCart;
    public void ButtonAddCart(){
        js.executeScript("window.scrollBy(0,1000)");
        this.btnaddCart.click();}

    @FindBy (xpath = " //*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    WebElement btnviewCart;
    public void ViewCard(){
        this.btnviewCart.click();
        js.executeScript("window.scrollBy(0,400)");}
    @FindBy (xpath = " //*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
    WebElement btnproceedcheckout;
    public void proceedCheckout(){
        js.executeScript("window.scrollBy(0,500)");
        this.btnproceedcheckout.click();}

    @FindBy (name = "billing_first_name")
    WebElement billingfirstname;
    @FindBy (name = "billing_last_name")
    WebElement billinglastname;

    @FindBy (xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]\")).sendKeys(\"Indonesia\");")
    WebElement countryselect;

    @FindBy (name = "billing_address_1")
    WebElement billAddrss;

    @FindBy (name = "billing_address_2")
    WebElement billAddrss2;

    @FindBy (name = "billing_city")
    WebElement billcity;

    @FindBy ( xpath = " billing_state")
    WebElement billstate;

    @FindBy ( id = " billing_postcode")
    WebElement postalcode;

    @FindBy ( name = " billing_phone")
    WebElement phonenumber;

    @FindBy ( name = "billing_email")
    WebElement emailaddres;

    @FindBy ( name = " terms")
    WebElement btnterm;

    @FindBy ( id = " place_order")
    WebElement btnplaceorder;
    public void ButtonlaceOrder (){
        this.btnplaceorder.click();
    }

    public void Checkoutform (String firstname, String lastname,
                              String email,String phone,
                              String address,String address2,String city,
                              String postcode){
        js.executeScript("window.scrollBy(0,400)");
        billingfirstname.sendKeys(firstname);
        billinglastname.sendKeys(lastname);
        emailaddres.sendKeys(email);
        phonenumber.sendKeys(phone);
        Select selectCountry = new Select(countryselect);
        selectCountry.selectByVisibleText("Indonesia");
        billAddrss.sendKeys(address);
        billAddrss2.sendKeys(address);
        billcity.sendKeys(city);
        Select selectProvince = new Select(countryselect);
        selectProvince.selectByVisibleText("DKI Jakarta");
        postalcode.sendKeys(postcode);}
    public void Terms(){
        this.btnterm.click();
    }

}

