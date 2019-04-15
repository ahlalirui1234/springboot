package myspring;

import org.apache.catalina.LifecycleException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("myspring")
public class Test {
    public static void main(String[] args) {
        try {
            SpringApplication.run();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
