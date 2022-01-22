package homework;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var electricCars = List.of(new Tesla(), new Nissan());
        electricCars.forEach(car -> {
            car.charge(8);
            car.start();
            car.drive(55);

            System.out.println("Residual energy: " + car.getBatteryLevel());
            System.out.println("Max energy capacity: " + car.getBatteryVolume());
        });


        var gasCars = List.of(new Toyota(), new Skoda());
        gasCars.forEach(car -> {
            car.fuel(10);
            car.start();
            car.drive(55);
            System.out.println("Residual gas: " + car.getTankLevel());
            System.out.println("Max tank capacity: " + car.getTankVolume());
        });

        var hybridCars = List.of(new BMW(), new Mercedes());
        hybridCars.forEach(car -> {
            car.charge(4);
            car.fuel(20);
            car.start();
            car.drive(62);
            System.out.println("Residual energy: " + car.getBatteryLevel());
            System.out.println("Residual gas: " + car.getTankLevel());
            System.out.println("Max energy capacity: " + car.getBatteryVolume());
            System.out.println("Max tank capacity: " + car.getTankVolume());

        });


    }
}