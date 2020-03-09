package store;

public class Menu {
    public static void main(String[] args) {
        StoreFrame storeFrame = new StoreFrame();
        storeFrame.setVisible(true);
        storeFrame.setSize(400, 200);
        storeFrame.setDefaultCloseOperation(StoreFrame.EXIT_ON_CLOSE);
        storeFrame.setTitle("Book store");
        String welcomeTitle =("Добре дошли !");
        storeFrame.welcomeTitle();
        new store.Tree();
        new store.FileReader();
    }
}
