package Persewaan;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Mau membuat berapa objek?");
            int jumlah = in.nextInt();
            System.out.println("Jumlah : " + jumlah);
        } catch (Exception e) {
            System.out.println("Tipe data salah");
        }

        System.out.println("Pilih CD atau DVD?");
        String pilihan = in.next();

        if (pilihan.equals("CD")) {
            
        }
    }
}
