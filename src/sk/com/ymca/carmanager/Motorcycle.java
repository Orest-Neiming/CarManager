package sk.com.ymca.carmanager;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color,
                      String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color.replaceAll("[*#!@~%^&()_+{}:\"<>?`1234567890-=\\[\\];',./]", "").toUpperCase());
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorcycle: " +
                "name = " + name +
                ", yearOfProduction=" + yearOfProduction +
                ", price = " + price +
                ", weight = " + weight +
                ", color = " + color +
                ", engineType='" + engineType +
                ", isReadyToDrive = " + isReadyToDrive +
                '.';
    }
}
