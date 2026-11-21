import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) { 
            System.out.println("\n=== MENU BISKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                while (true) { 
                    System.out.print("Masukkan baris: ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kursi tidak tersedia!");
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi! Silahkan pilih kursi lain.");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil disimpan!");
                        break;
                    }
                }
                break;

                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("***\t");
                            } else {
                                System.out.println(penonton[i][j] + "\t");
                            }
                    }
                    System.out.println();
                }
                break;

                case 3:
                    System.out.println("Program selesai.");
                    return;

                    default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
        
    }
}