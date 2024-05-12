package com.example.loginscreen;

public class Item {

    String name;
    String about;

    int image;

    public  Item (String name ,String about,int image){
        this.name = name;
        this.about = about;
        this.image = image;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
