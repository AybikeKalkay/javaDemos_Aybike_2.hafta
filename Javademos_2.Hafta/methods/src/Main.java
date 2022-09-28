public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sayıBulmaca();

    }
     public static void sayıBulmaca() {
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for(int sayi : sayilar) {
            if(sayi==aranacak) {
                varMi= true;
                break;
            }
        }

        if(varMi) {
            mesajVer(aranacak);
        } else System.out.println("Sayı mevcut değildir.");
    }

    public static void mesajVer(int aranacak) {
        System.out.println("Sayı mevcuttur: "+aranacak);
    }

    public static void sayıBulmaca() {
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for(int sayi : sayilar) {
            if(sayi==aranacak) {
                varMi= true;
                break;
            }
        }
        String mesaj ="";
        if(varMi) {
            mesaj = "Sayı mevcuttur: "+ aranacak;
            mesajVer(mesaj);

        } else System.out.println("Sayı mevcut değildir.");

    public static void mesajVer(String mesaj) {
            System.out.println(mesaj);
             }
        }

    }