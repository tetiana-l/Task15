package Task15;

public class MainForShop {

    public static void main(String[] args) {

        Shop shop = new Shop(2);
        ShopGoInto shopGoInto = new ShopGoInto(shop);
        ShopBreak shopBreak = new ShopBreak(shop);
        ShopGoOut shopGoOut = new ShopGoOut(shop);
        Thread t1 = new Thread(shopGoInto);
        Thread t2 = new Thread(shopGoOut);
        Thread t3 = new Thread(shopBreak);
        t1.start();
        t2.start();
        t3.start();
    }
}
