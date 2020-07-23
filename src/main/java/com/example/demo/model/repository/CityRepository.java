package com.example.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bean.City;

public interface CityRepository extends JpaRepository<City, Long>{

	public City findByLatitudeAndLongitude(String latitude, String longitude);

	public List <City> findByName (String name);

	public List <City> findByNomeIgnoreCase (String name);

}