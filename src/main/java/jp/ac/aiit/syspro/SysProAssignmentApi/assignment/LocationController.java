package jp.ac.aiit.syspro.SysProAssignmentApi.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @Autowired
    LocationWeatherService locationWeatherService;

    @RequestMapping("/locations/{zipcode}")
    public LocationWeather getWeather(@PathVariable String zipcode){
        return locationWeatherService.service(zipcode);
    }
}
