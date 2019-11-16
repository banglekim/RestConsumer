package com.bangle.restconsumer.Entity;

public class Item {
    private String id;
    private String iso2Code;
    private String value;
    public Item() {

    }
    public Item(String id, String iso2Code, String name) {
        this.id = id;
        this.iso2Code = iso2Code;
        this.value = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getIso2Code() {
        return iso2Code;
    }
    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }
    public String getName() {
        return value;
    }
    public void setName(String name) {
        this.value = name;
    }
}
