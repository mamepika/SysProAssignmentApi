package jp.ac.aiit.syspro.SysProAssignmentApi.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class LocationRepository {

    @Autowired
    @Qualifier("zipCodeSearchRestTemplate")
    RestTemplate restTemplate;

    private static final String URL = "http://zipcloud.ibsnet.co.jp/api/search?zipcode={zipcode}";

    public Location findByZipCode(String zip){
        return restTemplate.getForObject(URL, Location.class,zip);
    }
}
