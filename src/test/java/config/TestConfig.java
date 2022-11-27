package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import stepdefinitions.TestContext;

@Configuration
public class TestConfig {

    @Bean
    TestContext testContext(Environment environment){
        TestContext context = new TestContext();
        context.setEnv(environment);
        return context;
    }

}
