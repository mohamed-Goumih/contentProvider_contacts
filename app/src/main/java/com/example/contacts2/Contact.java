package com.example.contacts2;

public class Contact {
    String name,number,email,photo;

    public Contact(String id, String name, String number, String email, String photo, String otherDetails) {

        this.name = name;
        this.number = number;
        this.email = email;
        this.photo = photo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


}
