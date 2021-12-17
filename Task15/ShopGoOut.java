package Task15;

public class ShopGoOut implements Runnable {

    Shop shop;

    public ShopGoOut(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(MyRandom.getRandom(1000, 8001));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.goOut();
        }
    }
}