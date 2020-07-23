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
public class CityQueryTest {

    @Autowired
    private CityRepository repo;

    @Test
    public void testeFindOneByLatitudeAndLogitude () {
        City c = repo.findByLatitudeAndLongitude ("-12.2489", "-36.388");
        System.out.println(c);
    }

    @Test
    public void testFindManyByNome () {
        System.out.println(repo.findByName("Campinas"));
    }

    @Test
    public void testFindManyByNomeWithIgnoreCase () {
        System.out.println(repo.findByNomeIgnoreCase("BeLo HoRiZoNtE"));
    }

}