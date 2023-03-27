package javatest;

import java.math.BigInteger;

public class Country {
    
    private String name;
    private String countryCode;
    private BigInteger latestPopulation;
    private BigInteger oneYearEarlier;
    private BigInteger difference;
    private int index;

    public Country(String newName, String newCountryCode, BigInteger newLatestPopulation, BigInteger newOneYearEarlier, BigInteger newDifference, int newIndex){
        name = newName;
        countryCode = newCountryCode;
        latestPopulation = newLatestPopulation; 
        oneYearEarlier = newOneYearEarlier;
        difference = newDifference;
        index = newIndex;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public BigInteger getLatestPopulation() {
        return latestPopulation;
    }

    public BigInteger getOneYearEarlier() {
        return oneYearEarlier;
    }

    public BigInteger getDifference() {
        return difference;
    }

    // setters
    public void setName(String newName) {
        name = newName;
    }

    public void setCountryCode(String newCountryCode) {
        countryCode = newCountryCode;
    }

    public void setLatestPopulation(BigInteger newLatestPopulation) {
        latestPopulation = newLatestPopulation;
    }

    public void setOneYearEarlier(BigInteger newOneYearEarlier) {
        oneYearEarlier = newOneYearEarlier;
    }

    public void setDifference(BigInteger newDifference) {
        difference = newDifference;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
