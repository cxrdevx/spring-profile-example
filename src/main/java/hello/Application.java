package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Value("${spring.profiles.active:dev}")
    private String message;

    @RequestMapping("/")
    public String home() {
        return "Hello Docker " + message;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
