package pl.kathelan.flightapi.configuration;

import com.amadeus.Amadeus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AmadeusClient {

    private final static Logger LOGGER = Logger.getLogger(AmadeusClient.class.getName());

    @Value("${clientId}")
    private String clientId;
    @Value("${clientSecret}")
    private String clientSecret;

    public Amadeus getAmadeusObj() {
        return Amadeus.builder(clientId, clientSecret).setLogger(LOGGER).build();
    }
}
