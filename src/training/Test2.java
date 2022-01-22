package training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Banana");
        fruitList.add("Papaya");
        fruitList.add("Anannas");
        fruitList.add("Anannas");


        for (int i = fruitList.size() - 1; i >= 0; i--) {
            System.out.println(fruitList.get(i));
        }

//        HashSet<String> uniqueNames = new HashSet<>(fruitList);
//
//        System.out.println("\nOnly unique names:");
//        for (String name : uniqueNames) {
//            System.out.println(name);
//        }

        for (int i = 0; i < fruitList.size(); i++) {
            for (int j = 0; j < fruitList.size(); j++) {
                if (i != j) {
                    if (fruitList.get(i).equals(fruitList.get(j))) {
                        fruitList.remove(i);
                        break;
                    }
                }
            }
        }

        System.out.println("\nOnly unique names:");
        fruitList.forEach(System.out::println);

    }
}
