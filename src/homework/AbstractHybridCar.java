package homework;

public class AbstractHybridCar extends Car implements GasPowered, ElectricPowered {

    private final String brand;
    private final String startSound;
    private final double chargingPower;
    private final double maxBatteryCapacity;
    private final double energyFor1Km;
    private final int maxTankCapacity;
    private final double litersFor1Km;

    private double energyLevel = 0;
    private double tankLevel = 0;
    private boolean isStarted = false;

    public AbstractHybridCar(String brand, String startSound, double chargingPower, double maxBatteryCapacity, double energyFor1Km, int maxTankCapacity, double litersFor1Km) {
        this.brand = brand;
        this.startSound = startSound;
        this.chargingPower = chargingPower;
        this.maxBatteryCapacity = maxBatteryCapacity;
        this.energyFor1Km = energyFor1Km;
        this.maxTankCapacity = maxTankCapacity;
        this.litersFor1Km = litersFor1Km;
    }

    @Override
    void start() {
        this.isStarted = true;
        System.out.printf("%s started. %s%n", brand, startSound);
    }

    @Override
    void drive(int distance) {
        if (isStarted) {
            if (energyLevel <= 0 && tankLevel <= 0) {
                System.out.printf("Need to charge or fuel %s%n", brand);
            } else {
                double passedDistance = 0;
                do {
                    System.out.println("Pass 1 km...");

                    if (energyLevel > 0) {
                        if (energyLevel >= energyFor1Km) {
                            energyLevel -= energyFor1Km;
                            passedDistance++;
                        } else {
                            passedDistance += energyLevel / energyFor1Km;
                            energyLevel = 0;
                        }
                    } else if (tankLevel > 0) {
                        if (tankLevel >= litersFor1Km) {
                            tankLevel -= litersFor1Km;
                            passedDistance++;
                        } else {
                            passedDistance += tankLevel / litersFor1Km;
                            tankLevel = 0;
                        }
                    } else {
                        System.out.println("Run out of energy and gas");
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
    public void fuel(double liters) {
        if (this.tankLevel + liters > maxTankCapacity) {
            this.tankLevel = maxTankCapacity;
        } else {
            this.tankLevel = this.tankLevel + liters;
        }

        System.out.println("Tank level: " + this.tankLevel);
    }

    @Override
    public double getTankLevel() {
        return tankLevel;
    }

    @Override
    public int getTankVolume() {
        return maxTankCapacity;
    }

    @Override
    public double getBatteryLevel() {
        return energyLevel;
    }

    @Override
    public double getBatteryVolume() {
        return maxBatteryCapacity;
    }
}
