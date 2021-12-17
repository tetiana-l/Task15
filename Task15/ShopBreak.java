package Task15;

public class ShopBreak implements Runnable {

    Shop shop;

    ShopBreak(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.closeShop();
        }
    }
}
