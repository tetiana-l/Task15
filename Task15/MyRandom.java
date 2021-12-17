package Task15;

import java.util.concurrent.ThreadLocalRandom;

public class MyRandom {

    int startBound;
    int upperBound;

    public MyRandom(int upperBound, int startBound) {
        this.upperBound = upperBound;
        this.startBound = startBound;
    }


    static int getRandom(int startBound, int upperBound) {
        return ThreadLocalRandom.current().nextInt(startBound, upperBound);
    }
}
