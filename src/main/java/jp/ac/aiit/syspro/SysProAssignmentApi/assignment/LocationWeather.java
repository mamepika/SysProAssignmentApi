package jp.ac.aiit.syspro.SysProAssignmentApi.assignment;

import jp.ac.aiit.syspro.SysProAssignmentApi.weather.Forecast;
import java.util.List;

/**
 * 場所と3日分の天気予報データを保持する
 */
public class LocationWeather {

    private Location location;

    private List<Forecast> forecasts;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
