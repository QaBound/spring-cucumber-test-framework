package stepdefinitions;

import io.cucumber.spring.ScenarioScope;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.env.Environment;

import java.util.HashMap;

@ScenarioScope
public class TestContext {

    @Setter
    @Getter
    private Environment environment;

    private HashMap<String, Object> map = new HashMap<>();

    public <T> T get(String key, Class<T> cast) {
        var obj = map.get(key);
        return ((T) obj);
    }

    public void add(String key, Object object) {
        map.put(key, object);
    }


    public void setEnv(Environment environment) {
        this.environment = environment;
    }

}
