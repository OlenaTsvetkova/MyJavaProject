package homework;

public class Nissan extends AbstractElectricCar {

    private final static double CHARGING_POWER = 5.2;
    private final static double MAX_BATTERY_CAPACITY = 70;
    private final static double ENERGY_FOR_1_KM = 1.2;

    public Nissan() {
        super("Nissan", "Pram pam pam pam pam", CHARGING_POWER, MAX_BATTERY_CAPACITY, ENERGY_FOR_1_KM);
    }
}
