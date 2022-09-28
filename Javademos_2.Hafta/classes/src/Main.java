public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CustomerManager customerManager = new CustomerManager() ;
        //Class'lar reference type.
        //Bir class'ı kullanabilmek için onun newlenmiş olması gerekiyor.
        CustomerManager customManager2 = new CustomerManager();
        //customeManager = customeManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Integer, double, float are value type.
        // Value Type: "Sayi2'nin değeri = sayi1'in değeridir."
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //Arrays are reference type. It doesn't matter of being integer, byte or string.
        int [] sayilar1 = new int[] {1,2,3};
        int [] sayilar2 = new int[] { 4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

        // It keeps in itself common operations.

    }


}

