public class Main {
    public static void main(String[] args) {
        Cari nissan = new Cari();
        nissan.make = "nissan";
        nissan.price = 45;
        nissan.year = 2015;
        nissan.color = "blue";

        Cari dodge = new Cari();
        dodge.make = "dodge";
        dodge.price = 455;
        dodge.year = 20154;
        dodge.color = "blue3";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
        
    }
}
