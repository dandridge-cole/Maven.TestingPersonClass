package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private int heightInInches;
    private int shoeSize;
    private int weight;
    private String emergencyContact;

    public Person() {
            this.name="";
            this.age=Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age=age;
    }

    public Person(String name) {
        this.name=name;
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public Person(String name, int age, String eyeColor, int heightInInches, int shoeSize, int weight, String emergencyContact) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.heightInInches = heightInInches;
        this.shoeSize = shoeSize;
        this.weight = weight;
        this.emergencyContact = emergencyContact;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
