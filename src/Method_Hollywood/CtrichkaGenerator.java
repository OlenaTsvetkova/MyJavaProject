package Method_Hollywood;

import java.util.Random;

public class CtrichkaGenerator {
    private final int linksLimit;
    private final int rechtsLimit;

    public CtrichkaGenerator(int linksLimit, int rechtsLimit) {
        this.linksLimit = linksLimit;
        this.rechtsLimit = rechtsLimit;
    }

    public String generateCtrichka (int length){

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomLimitedInt = linksLimit + (int) (random.nextFloat() * (rechtsLimit - linksLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}
