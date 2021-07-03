package pl.pjatk.jazs21911nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Database {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Number ID", required = true, dataType = "Long")
    private Long Id;
    @ApiModelProperty(notes = "name of currency", required = true, dataType = "String")
    private String currency;
    @ApiModelProperty(notes = "date from", required = true, dataType = "String")
    private final String firstDate = createDate();
    @ApiModelProperty(notes = "date to", required = true, dataType = "String")
    private final String secondDate = createDate();
    @ApiModelProperty(notes = "date when quesiton coming", required = true, dataType = "String")
    private final String data = createDate();

    public Database(Long id, String currency) {
        Id = id;
        this.currency = currency;
    }

    public Database() {
    }

    public Database(String currency, String firstDate, String secondDate, Double average) {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public String getSecondDate() {
        return secondDate;
    }

    public String getData() {
        return data;
    }

    private String createDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        return dateFormat.format(date);
    }

}
