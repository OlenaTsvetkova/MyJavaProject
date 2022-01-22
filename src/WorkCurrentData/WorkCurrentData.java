package WorkCurrentData;

import java.time.LocalDate;

public class WorkCurrentData {
    public static void main(String[] args) {

        var date = LocalDate.now();
            // оголошую змінні
//        int monthsCount = 1;
//        int yearsCount = 1;
//        int dayCount = 1;
        //метод Local Date, назва змінноі, присвоюємо змінну  date методу LocalDate+змінна yearsCount.
//        LocalDate dateAfterYearModification = date.plusYears(yearsCount);
//        LocalDate dateAfterMonthModification = dateAfterYearModification.plusMonths(monthsCount);
//        LocalDate dateAfterDayModification = dateAfterMonthModification.plusDays(dayCount);
        // спосіб 2 через метод LocalDate і його змінну resultDate присвоіти всі методи date.plusYears(1).plusMonths(1).plusDays(1);
        LocalDate resultDate = date.plusYears(1).plusMonths(1).plusDays(1);

        System.out.println(date);
        System.out.println("============");
//        System.out.println(dateAfterYearModification);
//        System.out.println(dateAfterMonthModification);
        // спосіб 2 - виводимо результат System.out.println(resultDate);
        System.out.println(resultDate);
    }
}

