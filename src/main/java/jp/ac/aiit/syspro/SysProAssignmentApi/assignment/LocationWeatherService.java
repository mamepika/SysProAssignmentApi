package jp.ac.aiit.syspro.SysProAssignmentApi.assignment;


import jp.ac.aiit.syspro.SysProAssignmentApi.weather.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationWeatherService {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    WeatherRepository weatherRepository;

    public LocationWeather service(String zip){
        LocationWeather locationWeather = new LocationWeather();
        locationWeather.setLocation(locationRepository.findByZipCode(zip));
        locationWeather.setForecasts(weatherRepository.findByCityCode(zip).getForecasts());
        return  locationWeather;
    }
}
