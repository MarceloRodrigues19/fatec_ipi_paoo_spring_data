package com.example.demon.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.bean.City;
import com.example.demo.model.repository.CityRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CityTest {

    @Autowired
    private CityRepository cityRepository;


    @Test
    public void testInsertCityA () {
        City c = new City ();
        c.setNome("São Paulo");
        c.setLatitude("-48.3254");
        c.setLongitude("-26.1889");
        c = cityRepository.save(c);
        System.out.println(c.getId());
    }

    @Test
    public void testInsertCityB () {
        City c = new City ();
        c.setNome("Fernando de Noronha");
        c.setLatitude("-25.9876");
        c.setLongitude("-27.1234");
        c = cityRepository.save(c);
        System.out.println(c.getId());
    }

    @Test
    public void testInsertCityC () {
        City c = new City ();
        c.setNome("Salvador");
        c.setLatitude("-26.9090");
        c.setLongitude("-29.0001");
        c = cityRepository.save(c);
        System.out.println(c.getId());
    }

    @Test
    public void testInsertCityD () {
        City c = new City ();
        c.setNome("São Caetano do Sul");
        c.setLatitude("-18.9191");
        c.setLongitude("-29.4562");
        c = cityRepository.save(c);
        System.out.println(c.getId());
    }

    @Test
    public void testInsertCityE () {
        City c = new City ();
        c.setNome("Ilheus");
        c.setLatitude("-38.1428");
        c.setLongitude("-31.0009");
        c = cityRepository.save(c);
        System.out.println(c.getId());
    }
}