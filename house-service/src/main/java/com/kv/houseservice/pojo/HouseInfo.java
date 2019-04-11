package com.kv.houseservice.pojo;

import java.io.Serializable;

public class HouseInfo implements Serializable {

    private static final long serialVersionUID = -7177060519008376833L;

    private Long id;

    private String city = "";

    private String region = "";

    private String name = "";

    private String address = "";

    private double lng = 0;

    private double lat = 0;

    public HouseInfo() {}

    public HouseInfo(Long id, String city, String region, String name, String address, double lng, double lat) {
        this.id = id;
        this.city = city;
        this.region = region;
        this.name = name;
        this.address = address;
        this.lng = lng;
        this.lat = lat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
