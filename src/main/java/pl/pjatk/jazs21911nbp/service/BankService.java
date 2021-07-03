package pl.pjatk.jazs21911nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BankService {
    private final RestTemplate restTemplate;

    public BankService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
