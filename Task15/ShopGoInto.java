package Task15;

public class ShopGoInto implements Runnable {

    Shop shop;

    ShopGoInto(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(MyRandom.getRandom(2000, 5001));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.goInto();
        }
    }
}
