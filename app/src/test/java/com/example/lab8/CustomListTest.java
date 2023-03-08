package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();

    @Before
    public void init() {
        cityList = new ArrayList<>();
    }

    @Test
    public void testAddCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }


    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("calgary", "alberta");
        assertEquals(0, list.count());
    }
}
