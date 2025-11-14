import java.util.Scanner;
public class NilaiKelompok03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilai;
        int kelompokTertinggi = 0;
        float totalNilai; 
        float rataNilai;
        double rataTertinggi = 0;

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for(j=1; j<=5; j++){
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai/5;
            System.out.println("Kelompok " + i + ": " + "Nilai rata-rata = " + rataNilai);
            
            if(rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
            
        }
        System.out.println("Kelompok dengan nilai tertinggi : ");
        System.out.println("Kelompok " + kelompokTertinggi + " dengan rata rata : " + rataTertinggi);
    }
}
