package com.chrisboich.countriesoftheworld.data;


import com.chrisboich.countriesoftheworld.model.Country;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CountryRepository {

    public static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Greece", 10775557L, "Athens", "Greek", "English"),
            new Country("Belgium", 10449361L, "Brussels", "Dutch", "French"),
            new Country("Iceland", 317351L, "Reykjavik", "Icelandic", "Nordic"),
            new Country("Wales", 3063456L, "Cardiff", "English", "Welsh"),
            new Country("Scotland", 5327700L, "Edinburgh", "English", "Scots Gaelic")
            );

    //find country by name
    public Country findByName(String name){
        for(Country country : ALL_COUNTRIES){
            if(country.getCountryName().equals(name)){
                return country;
            }
        }
        return null;
    }

    //get every country in list above
    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

    //sort countries by name in forward A-Z
    public List<Country> sortByNameForward(){
        List<Country> countriesByName = new ArrayList<>(ALL_COUNTRIES);

        countriesByName.sort(
                (c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName())
        );

        return countriesByName;
    }

    //sort countries by name in forward Z-A
    public List<Country> sortByNameReverse(){
        List<Country> countriesByName = new ArrayList<>(ALL_COUNTRIES);

        countriesByName.sort(
                (c1, c2) -> c2.getCountryName().compareToIgnoreCase(c1.getCountryName())
        );

        return countriesByName;
    }

    //sort countries by population in acsending order
    public List<Country> sortByPopulationDescending(){
        List<Country> countriesByName = new ArrayList<>(ALL_COUNTRIES);

        countriesByName.sort(
                (c1, c2) -> c2.getCountryPopulation().compareTo(c1.getCountryPopulation())
        );

        return countriesByName;
    }

    //sort by population in descending order
    public List<Country> sortByPopulationAscending(){
        List<Country> countriesByName = new ArrayList<>(ALL_COUNTRIES);

        countriesByName.sort(
                (c1, c2) -> c1.getCountryPopulation().compareTo(c2.getCountryPopulation())
        );

        return countriesByName;
    }
}
