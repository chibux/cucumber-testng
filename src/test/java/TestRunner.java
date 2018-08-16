import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/test.feature",
        glue = "cjvm"
)
@RunWith(Cucumber.class)
public class TestRunner {
}