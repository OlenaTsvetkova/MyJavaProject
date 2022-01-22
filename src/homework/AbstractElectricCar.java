package homework;

public abstract class AbstractElectricCar extends Car implements ElectricPowered {

    private final String brand;
    private final String startSound;
    private final double chargingPower;
    private final double maxBatteryCapacity;
    private final double energyFor1Km;

    private double energyLevel = 0;
    private boolean isStarted = false;

    public AbstractElectricCar(String brand, String startSound, double chargingPower, double maxBatteryCapacity, double energyFor1Km) {
        this.brand = brand;
        this.startSound = startSound;
        this.chargingPower = chargingPower;
        this.maxBatteryCapacity = maxBatteryCapacity;
        this.energyFor1Km = energyFor1Km;
    }

    @Override
    void start() {
        this.isStarted = true;
        System.out.printf("%s started. %s%n", brand, startSound);
    }

    @Override
    void drive(int distance) {
        if (isStarted) {
            if (energyLevel <= 0) {
                System.out.printf("Need to charge %s%n", brand);
            } else {
                double passedDistance = 0;
                do {
                    System.out.println("Pass 1 km...");

                    if (energyLevel >= energyFor1Km) {
                        energyLevel -= energyFor1Km;
                        passedDistance++;
                    } else {
                        passedDistance += energyLevel / energyFor1Km;
                        energyLevel = 0;
                    }

                    if (energyLevel <= 0) {
                        System.out.println("Run out of energy");
                        break;
                    }
                } while (distance > passedDistance);

                System.out.println("Passed distance: " + passedDistance + " km");
            }
        } else {
            System.out.printf("Need to start %s%n", brand);
        }
    }

    @Override
    public void charge(double hours) {
        double chargeOn = hours * chargingPower;
        this.energyLevel += chargeOn;

        if (this.energyLevel > maxBatteryCapacity) {
            this.energyLevel = maxBatteryCapacity;
        }

        System.out.println("Charged on: " + chargeOn);
        System.out.println("Energy: " + this.energyLevel);
    }

    @Override
    public double getBatteryLevel() {
        return this.energyLevel;
    }

    @Override
    public double getBatteryVolume() {
        return maxBatteryCapacity;
    }
}
