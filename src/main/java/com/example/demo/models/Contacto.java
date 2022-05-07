package com.example.demo.models;

public class Contacto {
    public String name;
    public String phone;
    public int id;
    public Contacto(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
