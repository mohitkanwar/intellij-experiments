package com.xebia.greeting.hellointellij.people;

import java.util.Objects;

public class Address {

    private int id;
    private City city;
    private String addressLine1;
    private String addressLine2;

    public Address() {
    }

    public Address(int id, City city, String addressLine1, String addressLine2) {
        this.id = id;
        this.city = city;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getId() == address.getId() &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getAddressLine1(), address.getAddressLine1()) &&
                Objects.equals(getAddressLine2(), address.getAddressLine2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCity(), getAddressLine1(), getAddressLine2());
    }
}
