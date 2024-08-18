package sk.com.ymca.carmanager;

import java.util.Locale;

public class Car {
    String name;
    int yearOfProduction;
    int price; // euro
    int weight; // kg
    Color color;

    public Car(String name, int yearOfProduction, int price, int weight, String color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color.replaceAll("[*#!@~%^&()_+{}:\"<>?`1234567890-=\\[\\];',./]", "").toUpperCase());
    }

    @Override
    public String toString() {
        return "Car: " +
                "name = " + name +
                ", yearOfProduction = " + yearOfProduction +
                ", price = " + price +
                ", weight = " + weight +
                ", color = " + color +
                '.';
    }
}
