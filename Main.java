public class Main {
    public static void main(String[] args) {

        // Exercise 1
        Bentuk bentuk = new Bentuk("Merah");
        bentuk.printInfo();

        BujurSangkar bujurSangkar =
                new BujurSangkar(5, "Biru");
        bujurSangkar.printInfo();

        // Exercise 2
        Lingkaran lingkaran =
                new Lingkaran(7, "Hijau");
        lingkaran.printInfo();

        // Exercise 3
        Silinder silinder =
                new Silinder(10, 7, "Kuning");
        silinder.printInfo();
    }
}