import java.util.Scanner;
public class MainPangkat09 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah elemen: ");
    int elemen = input.nextInt();

    pangkat09[] png = new pangkat09[elemen];
    for(int i=0; i<elemen;i++){
        System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+ ": ");
        int basis = input.nextInt();
        System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
        int pangkat = input.nextInt();
        png[i] = new pangkat09(basis, pangkat);
    }
    System.out.println("HASIL PANGKAT BRUTEFORCE:");
    for (pangkat09 p : png) {
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
    }
    System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
    for (pangkat09 p : png) {
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
    }
}
}
