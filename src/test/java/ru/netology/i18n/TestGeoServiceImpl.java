package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.geo.GeoService;
import ru.netology.entity.Location;
import static ru.netology.entity.Country.*;

public class TestGeoServiceImpl {

    GeoService geoService = new GeoServiceImpl();

    @Test
    public void testIp1() {
        String ip = "127.0.0.1";

        Location result = geoService.byIp(ip);

        Assertions.assertEquals(result.getCountry(), null);
    }

    @Test
    public void testIp2() {
        String ip = "172.0.32.11";

        Location result = geoService.byIp(ip);

        Assertions.assertEquals(result.getCountry(), RUSSIA);
    }

    @Test
    public void testIp3() {
        String ip = "96.44.183.149";

        Location result = geoService.byIp(ip);

        Assertions.assertEquals(result.getCountry(), USA);
    }

    @Test
    public void testIp4() {
        String ip = "172.0.0.1";

        Location result = geoService.byIp(ip);

        Assertions.assertEquals(result.getCountry(), RUSSIA);
    }

    @Test
    public void testIp5() {
        String ip = "96.0.0.1";

        Location result = geoService.byIp(ip);

        Assertions.assertEquals(result.getCountry(), USA);
    }

    @Test
    public void testIp6() {
        String ip = "null";

        Location result = geoService.byIp(ip);

        Assertions.assertEquals(result, null);
    }

}
