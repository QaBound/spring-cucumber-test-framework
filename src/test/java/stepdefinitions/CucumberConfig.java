package stepdefinitions;


import config.TestConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration()
@SpringBootTest(classes = TestConfig.class)
public class CucumberConfig {


}
