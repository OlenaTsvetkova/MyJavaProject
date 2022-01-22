import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(List.of("Volvo", "BMW", "Yulia", "Mazda", "Andriy", "Yulia", "Yulia", "Jeffry"));
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        final String needToBeChanged = "Yulia";
        final String newValue = "Mercedes";

//        final var replaceIndex = cars.indexOf("Ford");
//
//        System.out.println(replaceIndex);
//
//        if (replaceIndex != -1) {
//            cars.set(replaceIndex, "New Value");
//        }

        final int halfLength = cars.size() / 2;
        for (int i = 0; i < halfLength; i++) {
            final String currentValue = cars.get(i);
            if (currentValue.equals(needToBeChanged)) {
                cars.set(i, newValue);
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
