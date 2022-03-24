package pl.kathelan.flightapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.kathelan.flightapi.configuration.services.SkyScannerClient;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyMap;

@ExtendWith({MockitoExtension.class})
public class SkyScannerClientUnitTest {

    @Spy
    @InjectMocks
    private SkyScannerClient skyScannerClient;

    @Mock
    private RestTemplate restTemplate;

    @Test
    void shouldGetTokenWhileFetchIsValid() {
        Mockito.when(restTemplate.getForEntity(any(), any(), anyMap())).thenReturn(new ResponseEntity<>("anyString", HttpStatus.OK));

        skyScannerClient.getToken();

    }

    @Test
    void shouldGetTokenWhileFetchIsInValid() {
        Mockito.when(restTemplate.getForEntity(any(), any(), anyMap())).thenReturn(new ResponseEntity<>("anyString", HttpStatus.INTERNAL_SERVER_ERROR));

        skyScannerClient.getToken();

    }

}
