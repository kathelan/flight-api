//package pl.kathelan.flightapi;
//
//import com.amadeus.Amadeus;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.test.context.ActiveProfiles;
//import pl.kathelan.flightapi.configuration.AmadeusClient;
//
//import static org.mockito.Mockito.*;
//
//@ActiveProfiles("test")
//@SpringBootTest
//@PropertySource("classpath:application-test.yaml")
//public class AmadeusClientUnitTest {
//
//    @Value("${clientId}")
//    private String clientId;
//    @Value("${clientSecret}")
//    private String clientSecret;
//
//    @Autowired
//    private AmadeusClient amadeusClient;
//
//    @Test
//    void shouldGetAmadeusObj() {
//        amadeusClient.getAmadeusObj();
//
//        verify(mock(Amadeus.class), times(1));
//    }
//}
