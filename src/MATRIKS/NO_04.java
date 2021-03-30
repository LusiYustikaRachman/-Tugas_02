package MATRIKS;
import java.util.Scanner;


public class NO_04 {
    public static void main(String[] args){
        int i, j, m, n;
        int matriks[][] = new int[2][3];
        int tranpose[][] = new int[3][2];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah baris matriks : ");
        m = scan.nextInt();
        System.out.print("Masukan jumlah kolom matriks : ");
        n = scan.nextInt();
        System.out.print("Masukan elemen matriks : ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks : ");
        for(i=0; 1<m; i++){
            for(j=0; j<n; j++){
                System.out.print(matriks[i][j] + "/t");
            }
            System.out.println();
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                tranpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("hasil tranpose matriks : ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(tranpose[i][j] + "/t");
            }
            System.out.println();
        }
    }
}
