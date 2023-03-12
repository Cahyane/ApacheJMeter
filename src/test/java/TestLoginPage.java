import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLoginPage {
    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();

    public TestLoginPage(){

        driver = Hooks.driver; }

    @Given("User open browser and url")
    public void user_open_browser_url() {
        driver.get(Constants.URL);
        System.out.println("User open browser and url");
    }
    @When("User enter invalid username")
    public void User_enter_invalid_username() {
        loginPage.enterUsername("12345");
        System.out.println("User enter empty Username");
    }

    @When("User enter valid username")
    public void User_enter_valid_username() {
        loginPage.enterUsername("Widya");
        System.out.println("User enter valid Username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password() {
        loginPage.enterPassword("Cobacoba123");
        System.out.println("User enter valid password");
    }
    @When("User click forgot password")
    public void user_click_forgot_password() {
        loginPage.Lostpswd();
        System.out.println("User click forgot Password");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.buttonLogin();
        System.out.println("User click button login");
    }

    @And("User click button show password")
    public void user_click_button_show_password() {
        loginPage.Showpswd();
        System.out.println("User click button show password"); }

    @And("User click button rememberme")
    public void user_click_button_rememberme() {
        loginPage.Rememberme();
        System.out.println("User click button show password"); }

    @And("User enter user Login")
    public void user_enter_user_login() {
        loginPage.UserLogin("Widya");
        System.out.println("ResetPassword"); }
    @And("User click reset password")
    public void user_click_reset_password() {
        loginPage.ResetPswd();
        System.out.println("User click button show password"); }
    @Then("User go to page Myaccount")
    public void user_go_to_page_myaccount() {
        loginPage.LoginTitle();
        System.out.println("User go to page Myaccount");
    }
    @Then("User get eror message")
    public void user_get_eror_message() {
        loginPage.Alert();
        System.out.println("Username is required");
    }
    @Then("User go to page shopDemo")
    public void user_go_to_page_shopdemo() {
        loginPage.PageShopDemo();
        System.out.println("User go to page ShopDemo");
    }
}
