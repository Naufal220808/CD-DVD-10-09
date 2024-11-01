package Persewaan;

public class testerArray {
    public static void main(String[] args) {
        Product[] produk = new Product[10];
        CD[] c = new CD[5];
        DVD[] d = new DVD[5];
        produk[0] = new Product();
        produk[0].print();
        c[4] = new CD(1, "Ryu", 13, 250, "Travis", 10, "Yamaha Music");
        c[4].print();
        produk[1] = new Product(1, "Table", 2, 50);
        produk[1].print();
        d[4] = new DVD(2, "Travis", 18, 500, 16, "18+", "YowisBand");
        d[4].print();
        produk[1] = new Product(2, "Chair", 3, 100);
        produk[1].print();
    }
}
