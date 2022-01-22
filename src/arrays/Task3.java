package arrays;

public class Task3 {
    public static void main(String[] args){
        double[] arrInt = new double [] {1, 4, 7, 8, 8, 1, 13, 8};

        System.out.println("All numbers:");
        for (double j : arrInt) {
            System.out.println(j);
        }

        int minIndex = -1;
        double minValue = Double.MAX_VALUE;

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] <= minValue) {
                minIndex = i;
                minValue = arrInt[i];
            }
        }

        arrInt[minIndex] = average(arrInt);

        System.out.println("\nWith replaced min element:");
        for (double number : arrInt) {
            System.out.println(number);
        }
    }

    private static double average(double[] arrInt) {
        double sum = 0;

        for (double number : arrInt) {
            sum += number;
        }

        final double v = sum / arrInt.length;
        return v;
        

    }
}
