
import com.juaracoding.cucumber.pages.ShopCart;
import com.juaracoding.cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;



public class TestShopCart {
        public static WebDriver driver;
        public static ShopCart shopCart = new ShopCart();
    public TestShopCart() {
            driver = Hooks.driver;}

    @When ("user click product")
    public void user_click_product(){
    shopCart.Product();
        System.out.println("choose the dresss");}

    @And("user click to add cart")
    public void user_click_to_add_cart(){
        shopCart.ButtonAddCart();
        System.out.println("add dress");}

    @And("user veiw cart")
    public void user_view_cart(){
        shopCart.ViewCard();
        System.out.println("View Cart");}

    @And("user proceed to checkout")
    public void user_proceed_to_checkout(){
        shopCart.proceedCheckout();
        System.out.println("Proceed Checkout");}

    @And("user fills checkout form")
    public void user_fills_checkout_form(){
        Hooks.delay(Constants.DETIK);
        shopCart.Checkoutform("Widya","Cahyani","widyacahyani122@gmail.com","084321543", "Skypia Street","Water Seven","Kota Bunga","120323");
        System.out.println("Checkout Form");}


    @And("user click term and condition")
    public void user_click_term_and_condition(){
        shopCart.Terms();
        System.out.println("term and condition");}

    @And("user click place order")
    public void user_click_place_order(){
        shopCart.ButtonlaceOrder();
        System.out.println("term and condition");}

    @Then("user get order detail")
    public void user_get_order_detail(){
        Hooks.delay(Constants.DETIK);
        shopCart.ButtonlaceOrder();
        System.out.println("Order Detail");}



    }





