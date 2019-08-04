package jp.ac.aiit.syspro.SysProAssignmentApi.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import java.util.List;

@JsonIgnoreType
public class Weather {

    private String title;

    private String link;

    private List<Forecast> forecasts;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
