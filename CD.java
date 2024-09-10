package Persewaan;
//subclass
public class CD extends Product{
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 10;
        name = "CD Selamat Malam";
        quantity = 0;
        price = 0.0;
        artist = "Ryuichi";
        totalSong = 0;
        label = "Pop Music";
    }
        public void CDprint() {
            System.out.println("number "+number);
            System.out.println("name "+name);
            System.out.println("quantity "+quantity);
            System.out.println("price "+price);
            System.out.println("artist "+artist);
            System.out.println("totalSong "+totalSong);
            System.out.println("label "+label);
        }

}
