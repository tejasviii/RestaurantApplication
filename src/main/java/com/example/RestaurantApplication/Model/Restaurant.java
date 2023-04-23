package com.example.RestaurantApplication.Model;

public class Restaurant {
    private String name;
    private int id;
    private String address;
    private String number;
    private String Specialty;
    private int staff;
    private double ratings;

    public Restaurant(String name, String address, String number, String specialty, int staff, double ratings,int id) {
        this.name = name;
        this.address = address;
        this.number = number;
        Specialty = specialty;
        this.staff = staff;
        this.ratings = ratings;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Restaurant() {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", Specialty='" + Specialty + '\'' +
                ", staff=" + staff +
                ", ratings=" + ratings +
                '}';
    }
}
