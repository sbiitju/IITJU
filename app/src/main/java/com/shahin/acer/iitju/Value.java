package com.shahin.acer.iitju;

public class Value {
    private String name;
    private String phone;
    private String email;
    private String temp;
   private int image;

    public Value(String name, String phone, String email, String temp, int image) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.temp = temp;
        this.image = image;
    }

    public Value() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
