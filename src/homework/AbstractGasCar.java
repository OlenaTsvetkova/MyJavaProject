package homework;

public abstract class AbstractGasCar extends Car implements GasPowered {

    private final String brand;
    private final String startSound;
    private final int maxTankCapacity;
    private final double litersFor1Km;

    private double tankLevel = 0;
    private boolean isStarted = false;

    public AbstractGasCar(String brand, String startSound, int maxTankCapacity, double litersFor1Km) {
        this.brand = brand;
        this.startSound = startSound;
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
            if (tankLevel <= 0) {
                System.out.printf("Need to fuel %s%n", brand);
            } else {
                double passedDistance = 0;
                do {
                    System.out.println("Pass 1 km...");

                    if (tankLevel >= litersFor1Km) {
                        tankLevel -= litersFor1Km;
                        passedDistance++;
                    } else {
                        passedDistance += tankLevel / litersFor1Km;
                        tankLevel = 0;
                    }

                    if (tankLevel <= 0) {
                        System.out.println("Run out of gas");
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
    public void fuel(double liters) {
        this.tankLevel += liters;

        if (this.tankLevel > maxTankCapacity) {
            this.tankLevel = maxTankCapacity;
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
}
