package com.ccj.entity;

public class Address {
    private String city;
    private Integer id;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", id=" + id +
                '}';
    }
}
