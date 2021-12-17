package Task15;

public class Shop {

    private int numOfClientsInShop;

    public Shop(int numOfClientsInShop) {
        this.numOfClientsInShop = numOfClientsInShop;
    }

    public synchronized void goInto() {
        while (numOfClientsInShop >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numOfClientsInShop++;
        System.out.println("Client is in the shop. Current num of clients " + numOfClientsInShop);
        notify();
    }

    public synchronized void goOut() {
        while (numOfClientsInShop < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numOfClientsInShop--;
        System.out.println("Client go out. Current num of clients " + numOfClientsInShop);
        notify();
    }

    public synchronized void closeShop() {

        try {
            System.out.println("Shop is having break");
            numOfClientsInShop = 0;
            System.out.println("Current num of clients in the shop = " + numOfClientsInShop);
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
