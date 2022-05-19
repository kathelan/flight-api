package pl.kathelan.flightapi.configuration;

import com.amadeus.Amadeus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class AmadeusClient {

    @Value("sm://AMADEUS_CLIENT_ID")
    private String clientId;
    @Value("sm://AMADEUS_CLIENT_SECRET")
    private String clientSecret;

    @PostConstruct
    public Amadeus getAmadeusObj() {
        log.info("clientId: {} clientSecret: {}",clientId ,clientSecret);
        return Amadeus.builder(clientId, clientSecret).build();
    }
}
