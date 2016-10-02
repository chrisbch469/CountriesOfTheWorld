package com.chrisboich.countriesoftheworld.controller;

import com.chrisboich.countriesoftheworld.data.CountryRepository;
import com.chrisboich.countriesoftheworld.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping(value="/")
    public String listCountries(ModelMap modelMap){
        List<Country> allCountries = countryRepository.getAllCountries();
        modelMap.put("countries", allCountries);
        return "index";
    }

    @RequestMapping(value = "/", params ="sort")
    public String sortCountries(@RequestParam ("sort") String property, ModelMap modelMap){
        List<Country> allCountries;

        //switch statement to sort or display countries based on paramaters
        switch (property){
            case "country-name-forward":
                allCountries = countryRepository.sortByNameForward();
                break;
            case "country-name-reverse":
                allCountries = countryRepository.sortByNameReverse();
                break;
            case "country-population-ascending":
                allCountries = countryRepository.sortByPopulationAscending();
                break;
            case "country-population-descending":
                allCountries = countryRepository.sortByPopulationDescending();
                break;
            default:
                allCountries = countryRepository.getAllCountries();
        }
        modelMap.put("countries", allCountries);
        return "index";
    }

    @RequestMapping(value = "/{countryName}/details")
    public String countryDetails(@PathVariable String countryName, ModelMap modelMap){
        Country country = countryRepository.findByName(countryName);
        modelMap.put("country", country);

        return "details";
    }

}
