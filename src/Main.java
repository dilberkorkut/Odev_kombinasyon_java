import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //C(n,r) = n! / (r! * (n-r)!)

        int n,r ;
        int nFakt = 1;
        int rFakt =1;
        int farkFakt =1;

        Scanner input = new Scanner(System.in);

        System.out.print("Kume(n degeri) sayisini giriniz: ");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            nFakt = nFakt * i;
        }
        System.out.println("n! : " + nFakt );

        System.out.print("Eleman sayisini(r degeri) giriniz: ");
        r = input.nextInt();

        for(int i = 1; i <= r; i ++){
            rFakt = rFakt * i;
        }
        System.out.println("r! : " +rFakt );


        System.out.print("Fark Faktoriyel degeri: ");
        for (int i = 1; i <= (n-r); i++){
            farkFakt = farkFakt * i;
        }
        System.out.println("(n-r)! : " +farkFakt );


        System.out.println("Kombinasyon Hesaplama Formulu: C(n,r) = n! / (r! * (n-r)!)");
        int kombinasyon =1;
        kombinasyon = nFakt / (rFakt * farkFakt);
        System.out.println("(C"+n+","+r+") :" +kombinasyon );

    }
}