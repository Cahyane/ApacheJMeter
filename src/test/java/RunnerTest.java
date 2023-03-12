import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = {"src/main/resources/features/Login.feature","src/main/resources/Shopcart.feature"},
            glue = {"com.juaracoding.cucumber"},
            plugin = {"pretty", "html:target/cucumber-report.html","json:target/cucumber.json"}
    )
    public class RunnerTest extends AbstractTestNGCucumberTests {

}

