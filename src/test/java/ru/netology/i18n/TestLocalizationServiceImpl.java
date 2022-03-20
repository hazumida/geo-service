package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.netology.entity.Country;

import static ru.netology.entity.Country.*;


public class TestLocalizationServiceImpl {

    LocalizationService localizationService = new LocalizationServiceImpl();

    @Test
    public void testCountry1() {
        // given:
        Country country = RUSSIA;
        String expected = "Добро пожаловать";

        // when:
        String result = localizationService.locale(country);

        // then:
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testCountry2() {
        // given:
        Country country = BRAZIL;
        String expected = "Welcome";

        // when:
        String result = localizationService.locale(country);

        // then:
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testCountry3() {
        // given:
        Country country = USA;
        String expected = "Welcome";

        // when:
        String result = localizationService.locale(country);

        // then:
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testCountry4() {
        // given:
        Country country = GERMANY;
        String expected = "Welcome";

        // when:
        String result = localizationService.locale(country);

        // then:
        Assertions.assertEquals(result, expected);
    }
}
