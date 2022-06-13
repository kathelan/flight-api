package pl.kathelan.flightapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.cloud.gcp.secretmanager.enabled=false"})
class FlightApiApplicationTests {

    @Test
    void contextLoads() {
    }

}
