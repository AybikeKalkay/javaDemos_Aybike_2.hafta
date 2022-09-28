public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
// Hata vermedi çünkü BaseKrediManager diğer kredileri kapsıyor.
    }
}

