package pl.kathelan.flightapi.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${greeting}")
    String greeting;

    @GetMapping("/")
    public String hello() {
        return greeting + " World!";
    }
}
