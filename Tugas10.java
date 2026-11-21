import java.util.Scanner;

public class Tugas10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("\nResponden ke-" + (i +1));

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();

                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("Nilai harus 1 sampai 5!");
                    System.out.print("Masukkan kembali: ");
                    survei[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("\n=== RATA-RATA SETIAP REPONDEN ===");
        
        double totalKeseluruhan = 0;

        for (int i = 0; i < survei.length; i++) {
            int totalResponden = 0;

            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
            }
            double rataRata = (double) totalResponden / survei[i].length;

            System.out.println("Responden ke-" + (i + 1) + ": ");

            totalKeseluruhan += totalResponden;
        }
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");

        for (int j = 0; j < survei[0].length; j++) {
            int totalPertanyaan = 0;

            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataRata = (double) totalPertanyaan / survei.length;

            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataRata);
        }
        double rataRataKeseluruhan = totalKeseluruhan / (survei.length * survei[0].length);

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.println("Rata-rata seluruh survei: " + rataRataKeseluruhan);
    }
}