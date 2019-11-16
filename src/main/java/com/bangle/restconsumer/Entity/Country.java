package com.bangle.restconsumer.Entity;

public class Country {
    private String id;
    private String iso2Code;
    private String name;
    private Item region;
    private Item adminregion;
    private Item incomeLevel;
    private Item lendingType;
    private String capitalCity;
    private String longitude;
    private String lattitude;
    public Country(String id, String iso2Code, String name, Item region, Item adminregion,
                                         Item incomeLevel, Item lendingType, String capitalCity, String longitude, String lattitude) {
        this.id = id;
        this.iso2Code = iso2Code;
        this.name = name;
        this.region = region;
        this.adminregion = adminregion;
        this.incomeLevel = incomeLevel;
        this.lendingType = lendingType;
        this.capitalCity = capitalCity;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }
    public Country() {

    }

    public String getIso2Code ( ) {
        return iso2Code;
    }

    public void setIso2Code ( String iso2Code ) {
        this.iso2Code = iso2Code;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Item getRegion ( ) {
        return region;
    }

    public void setRegion ( Item region ) {
        this.region = region;
    }

    public Item getAdminregion ( ) {
        return adminregion;
    }

    public void setAdminregion ( Item adminregion ) {
        this.adminregion = adminregion;
    }

    public Item getIncomeLevel ( ) {
        return incomeLevel;
    }

    public void setIncomeLevel ( Item incomeLevel ) {
        this.incomeLevel = incomeLevel;
    }

    public Item getLendingType ( ) {
        return lendingType;
    }

    public void setLendingType ( Item lendingType ) {
        this.lendingType = lendingType;
    }

    public String getCapitalCity ( ) {
        return capitalCity;
    }

    public void setCapitalCity ( String capitalCity ) {
        this.capitalCity = capitalCity;
    }

    public String getLongitude ( ) {
        return longitude;
    }

    public void setLongitude ( String longitude ) {
        this.longitude = longitude;
    }

    public String getLattitude ( ) {
        return lattitude;
    }

    public void setLattitude ( String lattitude ) {
        this.lattitude = lattitude;
    }
}
