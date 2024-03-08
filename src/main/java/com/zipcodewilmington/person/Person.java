package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String birthMonth;
    private String favColor;
    private String favDrink;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Person(String birthMonth, String favColor, String favDrink) {
        this.birthMonth = birthMonth;
        this.favColor = favColor;
        this.favDrink = favDrink;
    }

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public void setFavDrink(String favDrink) {
        this.favDrink = favDrink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getFavColor() {
        return favColor;
    }

    public String getFavDrink() {
        return favDrink;
    }
}
