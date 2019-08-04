package jp.ac.aiit.syspro.SysProAssignmentApi.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;


    private static final String URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city={citycode}";

    public  Weather service(String citycode){
        return restTemplate.getForObject(URL,Weather.class,citycode);
    }

}
