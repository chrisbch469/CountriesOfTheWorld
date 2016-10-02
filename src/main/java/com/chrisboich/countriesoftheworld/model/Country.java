package com.chrisboich.countriesoftheworld.model;


import java.text.NumberFormat;
import java.util.Locale;

public class Country {

    //country attributes
    private String countryName;
    private Long countryPopulation;
    private String countryCapital;
    private String countryLanguage1;
    private String countryLanguage2;


    //constructor
    public Country(String countryName, Long countryPopulation, String countryCapital,
                   String countryLanguage1, String countryLanguage2) {
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.countryCapital = countryCapital;
        this.countryLanguage1 = countryLanguage1;
        this.countryLanguage2 = countryLanguage2;
    }

    //getter and setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(Long countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public String getFormattedCountryPopulation(){
        return NumberFormat.getNumberInstance(Locale.US).format(countryPopulation);
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String capital) {
        countryCapital = capital;
    }

    public String getCountryLanguage1() {
        return countryLanguage1;
    }

    public void setCountryLanguage1(String countryLanguage1) {
        this.countryLanguage1 = countryLanguage1;
    }

    public String getCountryLanguage2() {
        return countryLanguage2;
    }

    public void setCountryLanguage2(String countryLanguage2) {
        this.countryLanguage2 = countryLanguage2;
    }
}
