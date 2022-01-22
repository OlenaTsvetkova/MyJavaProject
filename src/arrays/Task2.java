package arrays;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args){
        int[] arrInt = new int[]{1, 4, 7, 8, 8, 1, 13, 8};

        System.out.println("All numbers:");
        for (int j : arrInt) {
            System.out.println(j);
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : arrInt) {
            uniqueNumbers.add(number);
        }

        System.out.println("\nOnly unique numbers:");
        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}

