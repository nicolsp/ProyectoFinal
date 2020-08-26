package com.example.checkapartmentni2;

import java.util.ArrayList;
import java.util.List;

    public class ApartmentData {
        public static List<Apartment> apartmentList() {
            List<Apartment> apartmentList = new ArrayList<>();
            Apartment apartment01 = new Apartment("Edificio Almendro","Torre 1", "depto 2002", "san jose 345, La florida , Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
            Apartment apartment02 = new Apartment("Edificio Almendro","Torre 1", "depto 2003", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
            Apartment apartment03 = new Apartment("Edificio Almendro","Torre 1", "depto 1601", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
            Apartment apartment04 = new Apartment("Edificio Alerces","Torre b", "depto 1602", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
            Apartment apartment05 = new Apartment("Edificio Alerces","Torre b", "depto 1801", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
            Apartment apartment06 = new Apartment("Edificio Legado 2","Torre a", "depto 801", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            Apartment apartment07 = new Apartment("Edificio Legado 2","Torre a", "depto 902", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            Apartment apartment08 = new Apartment("Edificio Legado 2","Torre a", "depto 909", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            Apartment apartment09 = new Apartment("Edificio Legado 2","Torre a", "depto 1901", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            Apartment apartment10 = new Apartment("Condominio nuevo mirador","Torre 1", "depto 102", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            Apartment apartment11 = new Apartment("Condominio nuevo mirador","Torre 1", "depto 103", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            Apartment apartment12 = new Apartment("Condominio nuevo mirador","Torre 1", "depto 1501", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            Apartment apartment13 = new Apartment("Condominio nuevo mirador","Torre 1", "depto 1503", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            Apartment apartment14 = new Apartment("Condominio nuevo mirador","Torre 2", "depto 2001", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            Apartment apartment15 = new Apartment("Condominio nuevo mirador","Torre 2", "depto 2201", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            apartmentList.add(apartment01);
            apartmentList.add(apartment02);
            apartmentList.add(apartment03);
            apartmentList.add(apartment04);
            apartmentList.add(apartment05);
            apartmentList.add(apartment06);
            apartmentList.add(apartment07);
            apartmentList.add(apartment08);
            apartmentList.add(apartment09);
            apartmentList.add(apartment10);
            apartmentList.add(apartment11);
            apartmentList.add(apartment12);
            apartmentList.add(apartment13);
            apartmentList.add(apartment14);
            apartmentList.add(apartment15);
            return apartmentList;
        }
    }


