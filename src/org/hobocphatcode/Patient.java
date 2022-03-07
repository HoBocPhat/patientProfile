package org.hobocphatcode;

public class Patient {
    private String name;
    private int age;
    private Eye righteye;
    private Eye lefteye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye righteye, Eye lefteye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.righteye = righteye;
        this.lefteye = lefteye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public void inFor() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getRighteye() {
        return righteye;
    }

    public void setRighteye(Eye righteye) {
        this.righteye = righteye;
    }

    public Eye getLefteye() {
        return lefteye;
    }

    public void setLefteye(Eye lefteye) {
        this.lefteye = lefteye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
