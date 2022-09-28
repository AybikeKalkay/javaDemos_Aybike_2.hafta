public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        //String yeniMesaj = mesaj.substring (0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(3,4,8,15,22);
        System.out.println(toplam);
    }

    public static void ekle(){

    }

    public static void siz() {

    }

    public static void guncelle() {

    }
    // void operasyonlar'a bir şeyi yap dersiniz.

    public static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
        // Bu fonksiyon interger türünde bir değer döndürür.
    }

    public static int topla2(int... sayilar) {
        //3 nokta koyarak yazdığımızda integer array gibi çalışıyor.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}