package com.tlg.slidinganimationrecyclerview.util;

import com.tlg.slidinganimationrecyclerview.model.Country;

import java.util.ArrayList;

public class Constants {

    public static ArrayList<Country> getCountryList(){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("AUSTRALIA","CANBERRA"));
        countries.add(new Country("ARGENTINA","BUENOS AIRES"));
        countries.add(new Country("AUSTRIA","VIENNA"));
        countries.add(new Country("INIDA","New Delhi"));
        countries.add(new Country("BAHRAIN","MANAMA"));
        countries.add(new Country("BELGIUM","BRUSSELS"));
        countries.add(new Country("BRAZIL","BRASILIA"));
        countries.add(new Country("BULGARIA","SOFIA"));
        countries.add(new Country("CANADA","OTTAWA"));
        countries.add(new Country("CHINA","BEIJING"));
        countries.add(new Country("EGYPT","CAIRO"));
        countries.add(new Country("ENGLAND","London"));

        return countries;
    }
}
