package sk.com.ymca.carmanager;

public class CarManager {

    public static void main(String[] args) {

        Car toyota =  new Car("Prius", 2012, 13500, 1350, "white");

        Car renoult =  new Car("Laguna", 2006, 10850, 1720, "blue");

        System.out.println(toyota + "\n" + renoult);

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000,
                600, "black", "diesel", true);

        Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000,
                700, "orange", "gas", false);
        System.out.println(suzuki + "\n" + yamaha);

    }
}
