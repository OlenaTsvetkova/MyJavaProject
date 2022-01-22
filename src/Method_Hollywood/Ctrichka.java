//package Method_Hollywood;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Ctrichka {
//    public static void main(String[] args) {
//
//    int linksLimit = 33; //ASCI printable characters
//    int rechtsLimit = 120;
//
//    CtrichkaGenerator ctrichkaGenerator = new CtrichkaGenerator(linksLimit, rechtsLimit);
//
//    int randomListLength = randomNumber(10, 20);
//    List<String> allString = new ArrayList<>(randomListLength);
//
//    for(int i = 0; i<randomListLength; i++)
//
//    {
//        int randomStringLength = randomNumber(6, 15);
//
//        String randomString = ctrichkaGenerator.generateCtrichka(randomStringLength);
//        allString.add(randomString);
//
//        allString.forEach(System.out::println);
//    }
//
//    private static int randomNumber(int from, int to) {
//        Random random = new Random();
//        return from + random.nextInt(to - from + 1);
//
//    }
//}
