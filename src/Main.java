import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double perkm = 2.20, total, startPrice= 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Toplam kilometreyi giriniz: ");
        km = input.nextInt();

        total = (km * perkm);
        total += startPrice;

        total = (total < 20 ) ? 20 : total;

        System.out.print("Toplam Ücret: " + total);

    }
}