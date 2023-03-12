package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement username;
    public void enterUsername(String username) {
        this.username.sendKeys(username);}
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;
    public void enterPassword(String password) {
        this.password.sendKeys(password);}

    @FindBy(xpath = "//form[@class='woocommerce-form woocommerce-form-login login']//span[@class='show-password-input']")
    WebElement btnshowpswd;
    public void Showpswd (){
        this.btnshowpswd.click();}
    @FindBy(xpath = "//input[@id='rememberme']")
    WebElement btnRememberme;
    public void Rememberme (){
        this.btnRememberme.click();}
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;
    public void buttonLogin (){
        this.btnLogin.click();}
    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement loginTitle;
    public void LoginTitle (){
        this.loginTitle.click();}
    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement pageshopDemo;
    public void PageShopDemo (){
        this.pageshopDemo.click();}

    @FindBy(xpath = "//a[normalize-space()='Lost your password?']")
    WebElement btnLostpswd;
    public void Lostpswd (){
        this.btnLostpswd.click();}
    @FindBy(xpath = "//button[@value='Reset password']")
    WebElement btnResetpswd;
    public void ResetPswd () {
        this.btnResetpswd.click();}

    @FindBy(xpath = "//ul[@role='alert']")
    WebElement msgalert;
    public void Alert() {
        this.msgalert.getText();}

        @FindBy(xpath = "//input[@id='user_login']")
        WebElement userLogin;
        public void UserLogin (String userLogin){
            this.userLogin.sendKeys(userLogin); }
    public String getLoginTitle(){ return loginTitle.getText(); }


//    public void resetPassword(String userLogin){
//        js.executeScript("window.scrollBy(0,250)");
//        this.btnLostpswd.click();
//        js.executeScript("window.scrollBy(0,200)");
//        this.userLogin.sendKeys("Widya");
//        this.btnResetpswd.click();
//        js.executeScript("window.scrollBy(0,100)", "");
//    }

    public void login(String username, String password){
        this.username.sendKeys("Widya");
        this.password.sendKeys("Cobacoba123");
        this.btnshowpswd.click();
        this.btnRememberme.click();
        btnLogin.click();

    }
}


