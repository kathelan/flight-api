package pl.kathelan.flightapi.configuration.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class SkyScannerClient {

    private static final String PRE_URL = "https://partners.api.skyscanner.net/apiservices/";
    private static final String TOKEN_URL = "token/v2/gettoken?apiKey={apiKey}";
    private static final String ApiKey = "prtl6749387986743898559646983194";
    private RestTemplate restTemplate;

    public void getToken() {
        Map<String, String> params = new HashMap<>();
        params.put("apiKey", ApiKey);
        String tokenUrl = PRE_URL + TOKEN_URL;
        ResponseEntity<String> response = restTemplate.getForEntity(tokenUrl, String.class, params);
        validateEndpointStatus(response);
    }

    private void validateEndpointStatus(ResponseEntity<String> response) {
        var httpStatus = response.getStatusCode();
        if (httpStatus.is2xxSuccessful()) {
            log.info("successfully fetch");
        } else {
            log.error("error while fetching endpoint");
        }
    }

}
