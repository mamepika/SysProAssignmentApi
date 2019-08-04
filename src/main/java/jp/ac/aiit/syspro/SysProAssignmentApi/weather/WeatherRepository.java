package jp.ac.aiit.syspro.SysProAssignmentApi.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherRepository {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL =
            "http://weather.livedoor.com/forecast/webservice/json/v1?city={citycode}";

    public Weather findByCityCode(String cityCode){
        return restTemplate.getForObject(URL,Weather.class,cityCode);
    }
}
