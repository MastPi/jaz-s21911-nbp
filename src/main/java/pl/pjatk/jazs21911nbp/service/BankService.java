package pl.pjatk.jazs21911nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs21911nbp.model.Database;
import pl.pjatk.jazs21911nbp.model.Rate;
import pl.pjatk.jazs21911nbp.model.Root;
import pl.pjatk.jazs21911nbp.repository.BankRepository;

@Service
public class BankService {
    private final RestTemplate restTemplate;
    public final BankRepository bankRepository;

    public BankService(RestTemplate restTemplate, BankRepository bankRepository) {
        this.restTemplate = restTemplate;
        this.bankRepository = bankRepository;
    }


  /*  public  Database getPriceFromDays(String currency, String firstDate, String secondDate) {

        Root root = restTemplate.getForObject
                ("http://api.nbp.pl/api/exchangerates/rates/a/gbp/2012-01-01/2012-01-31/" + currency +
                        "/firstDate/" + firstDate + "/secondDate/" + secondDate, Root.class);
        Double average = root
                .getRates().stream()
                .mapToDouble(Rate::getMid)
                .sum() / ();
        Database Database = new Database(root.getCurrency(), firstDate,secondDate, average);
        BankRepository.save(Database);
        return Database;
    }*/


}
