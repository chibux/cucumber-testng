import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/test.feature",
        glue = "cjvm"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}